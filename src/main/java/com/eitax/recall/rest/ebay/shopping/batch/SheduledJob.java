package com.eitax.recall.rest.ebay.shopping.batch;

import java.util.List;


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
import com.eitax.recall.ebay.model.EbayItem;
import com.eitax.recall.ebay.model.EbaySite;
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
	private RecallService recallService;

	@Scheduled(fixedRate = 900000)
	public void invoke() {
		try{
			int call = 0;
			System.err.println("ready");
			List<EbayApi> ebayApiList = ebayApiService.findAll();
			String appid = null;
			for (EbayApi ea : ebayApiList) {
				System.err.println(ea);
				appid = ea.getAppid();
			}
			
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
