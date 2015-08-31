package com.eitax.recall.amazon.service.impl;

import java.io.StringReader;
import java.util.List;
import java.util.TimeZone;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.eitan.recall.model.AmazonItem;
import com.eitan.recall.model.AmazonItemDetail;
import com.eitan.recall.model.AwsApi;
import com.eitan.recall.model.AwsApiCall;
import com.eitan.recall.model.YahooApiCall;
import com.eitax.recall.amazon.dao.AmazonItemDAO;
import com.eitax.recall.amazon.dao.AmazonItemDetailDAO;
import com.eitax.recall.amazon.dao.AwsApiCallDAO;
import com.eitax.recall.amazon.dao.AwsApiDAO;
import com.eitax.recall.amazon.service.AmazonService;
import com.eitax.recall.amazon.xsd.Item;
import com.eitax.recall.amazon.xsd.ItemLookupResponse;
import com.eitax.recall.amazon.xsd.OfferSummary;
import com.eitax.recall.amazon.xsd.Price;

@Component
public class AmazonServiceImpl implements AmazonService {
    @Autowired
    private AmazonItemDAO amazonItemDAO;
    @Autowired
    private AmazonItemDetailDAO amazonItemDetailDAO;
    @Autowired
    private AwsApiCallDAO awsApiCallDAO;
    @Autowired
    private AwsApiDAO awsApiDAO;
    
	private static final Logger log = LoggerFactory.getLogger(AmazonServiceImpl.class);

	@Transactional
    public AwsApiCall registerAwsApiCallAndFindAwsApi(){
		DateTime now = DateTime.now().withZone(DateTimeZone.forTimeZone(TimeZone.getTimeZone("JST")))
				.withHourOfDay(0).withMinuteOfHour(0).withSecondOfMinute(0).withMillisOfSecond(0);
		String yyyyMMdd = now.toString("yyyyMMdd");
		List<AwsApiCall> list = awsApiCallDAO.findByCallYyyymmdd(now.toString("yyyyMMdd"));
		if (0 == list.size()) {
			List<AwsApi> awsApiList = awsApiDAO.findAll();
			for (AwsApi ya : awsApiList) {
				AwsApiCall yap = new AwsApiCall();
				yap.setCnt(0);
				yap.setYyyymmdd(yyyyMMdd);
				yap.setDelFlag(0);
				yap.setAwsApi(ya);
				awsApiCallDAO.save(yap);
			}
			list = awsApiCallDAO.findByCallYyyymmdd(now.toString("yyyyMMdd"));
		}
		AwsApiCall apc = list.get(0);
		return apc;
    }
	@Override
	@Transactional
	public void registerItems(Item item, ItemLookupResponse ilr, Integer recallId) {
		List<AmazonItem> items = amazonItemDAO.deleteByAsin(item.getASIN());
		for (AmazonItem ai : items){
			amazonItemDetailDAO.deleteByAmazonItemId(ai.getAmazonItemId());
		}
		
		AmazonItem ai = new AmazonItem();
		ai.setAsin(item.getASIN());
		ai.setDetailPageUrl(item.getDetailPageURL());
		ai.setManufacturer(item.getItemAttributes().getManufacturer());
		ai.setTITLE(item.getItemAttributes().getTitle());
		ai.setIsbn(item.getItemAttributes().getISBN());
		ai.setRecallId(recallId);
		AmazonItem ret = amazonItemDAO.save(ai);

		AmazonItemDetail aid = new AmazonItemDetail ();
		aid.setAmazonItemId(ret.getAmazonItemId());
		
		OfferSummary os = ilr.getItems().get(0).getItem().get(0).getOfferSummary();
		if (os != null){
			Price lnp = os.getLowestNewPrice();
			if (lnp != null){
				aid.setNewAmount(lnp.getAmount().intValue());
			}
			Price lup = os.getLowestUsedPrice();
			if (lup != null){
				aid.setUsedAmount(lup.getAmount().intValue());
			}
			aid.setTotalNew(Integer.valueOf(os.getTotalNew()));
			aid.setTotalNew(Integer.valueOf(os.getTotalUsed()));
		}
		amazonItemDetailDAO.save(aid);
	}
	@Transactional
	public void updateApiCallCount(Integer awsApiCallId,Integer cnt){
		awsApiCallDAO.update(awsApiCallId,cnt);
	}

}
