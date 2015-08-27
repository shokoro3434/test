package com.eitax.recall.rest.ebay.shopping.batch;

import java.util.List;
import java.util.TimeZone;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.ebay.services.client.ClientConfig;
import com.ebay.services.client.FindingServiceClientFactory;
import com.ebay.services.finding.FindItemsByKeywordsRequest;
import com.ebay.services.finding.FindItemsByKeywordsResponse;
import com.ebay.services.finding.FindingServicePortType;
import com.ebay.services.finding.SearchItem;
import com.eitan.recall.batch.CronJob;
import com.eitan.recall.model.Recall;
import com.eitan.recall.service.RecallService;
import com.eitax.recall.ebay.model.EbayApi;
import com.eitax.recall.ebay.model.EbayApiCall;
import com.eitax.recall.ebay.model.EbayItem;
import com.eitax.recall.ebay.model.EbaySite;
import com.eitax.recall.ebay.shopping.service.EbayApiCallService;
import com.eitax.recall.ebay.shopping.service.EbayApiService;
import com.eitax.recall.ebay.shopping.service.EbayItemService;
import com.eitax.recall.ebay.shopping.service.EbaySiteService;

@Component
public class SheduledJob {

	private static final Logger log = LoggerFactory.getLogger(CronJob.class);

	@Autowired
	private EbaySiteService ebaySiteService;
	@Autowired
	private EbayApiService ebayApiService;
	@Autowired
	private EbayItemService ebayItemService;
	@Autowired
	private EbayApiCallService ebayApiCallService;
	@Autowired
	private RecallService recallService;

	@Scheduled(fixedRate = 900000)
	public void invoke() {
		try{
			DateTime now = DateTime.now().withZone(DateTimeZone.forTimeZone(TimeZone.getTimeZone("JST")))
					.withHourOfDay(0).withMinuteOfHour(0).withSecondOfMinute(0).withMillisOfSecond(0);
			String yyyyMMdd = now.toString("yyyyMMdd");
			log.info(yyyyMMdd);
			List<EbayApiCall> list = ebayApiCallService.findByCallYyyymmdd(now.toString("yyyyMMdd"));
			if (0 == list.size()) {
				List<EbayApi> ebayApiList = ebayApiService.findAll();
				for (EbayApi ya : ebayApiList) {
					EbayApiCall yap = new EbayApiCall();
					yap.setCnt(0);
					yap.setYyyymmdd(yyyyMMdd);
					yap.setDelFlag(0);
					yap.setEbayApi(ya);
					ebayApiCallService.save(yap);
				}
				list = ebayApiCallService.findByCallYyyymmdd(now.toString("yyyyMMdd"));
			}
			EbayApiCall apc = list.get(0);
			String appid = apc.getEbayApi().getAppid();

			int call = 0;
			Page<Recall> recalls = recallService.findByEbayFlag(1, new PageRequest(0, 100));
			for (Recall recall : recalls) {
				for (EbaySite es : ebaySiteService.findByDelFlag(0)){
					ClientConfig config = new ClientConfig();
					config.setEndPointAddress("http://svcs.ebay.com/services/search/FindingService/v1");
					config.setGlobalId(es.getGlobalId());
					config.setApplicationId(appid);
					FindingServicePortType pspt = FindingServiceClientFactory.getServiceClient(config);
					FindItemsByKeywordsRequest req = new FindItemsByKeywordsRequest();
					req.setKeywords(recall.getRecallName());
					FindItemsByKeywordsResponse resp = pspt.findItemsByKeywords(req);
					++call;
					if(!"Success".equals(resp.getAck().value())){
						log.error("error : "+resp.getAck().value());
						throw new RuntimeException();
					}
					else{
						
						for (SearchItem si : resp.getSearchResult().getItem()){
							String itemId = si.getItemId();
							EbayItem tmp = ebayItemService.findByItemId(itemId);
							ebayItemService.removeByItemId(itemId);
							
							EbayItem ei = new EbayItem();
							ei.setItemId(si.getItemId());
							ei.setTitle(si.getTitle());
							ei.setGlobalId(si.getGlobalId());
							ei.setCategoryId(si.getPrimaryCategory().getCategoryId() != null ? si.getPrimaryCategory().getCategoryId() : "");
							ei.setViewItemUrl(si.getViewItemURL());
							ei.setPaymentMethod(si.getPaymentMethod().toString());
							ei.setPostalCode(si.getPostalCode());
							ei.setLocation(si.getLocation());
							ei.setShippingServiceCost(si.getShippingInfo().getShippingServiceCost() != null ? si.getShippingInfo().getShippingServiceCost().getValue() : 0);
							ei.setShippingType(si.getShippingInfo().getShippingType());
							ei.setShipToLocations(convert(si.getShippingInfo().getShipToLocations()));
							ei.setConvertedCurrentPrice(si.getSellingStatus().getConvertedCurrentPrice().getValue());
							ei.setCurrencyId(si.getSellingStatus().getCurrentPrice().getCurrencyId());
							ei.setStartTime(si.getListingInfo().getStartTime().getTime());
							ei.setEndTime(si.getListingInfo().getEndTime().getTime());
							ei.setRecallId(recall.getRecallId());
							this.ebayItemService.save(ei);
						}
					}
					System.out.println(call);
					System.err.println("done");
				}
			}
			ebayApiCallService.update(apc.getEbayApiCallId(), call);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	private String convert(List<String> list){
		StringBuffer sb = new StringBuffer();
		for (String o : list){
			sb.append(o.toString());
			sb.append(" ");
		}
		System.out.println(sb);
		return sb.toString();
	}
}
