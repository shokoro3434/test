package com.eitax.recall.yahoo.facade.impl;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eitax.recall.amazon.facade.impl.AmazonServiceFacadeImpl;
import com.eitax.recall.amazon.model.AwsApi;
import com.eitax.recall.amazon.model.AwsApiCall;
import com.eitax.recall.amazon.rest.AmazonRestService;
import com.eitax.recall.amazon.service.AmazonService;
import com.eitax.recall.amazon.xsd.Item;
import com.eitax.recall.amazon.xsd.ItemLookupResponse;
import com.eitax.recall.amazon.xsd.ItemSearchResponse;
import com.eitax.recall.model.Recall;
import com.eitax.recall.service.SharedService;
import com.eitax.recall.yahoo.facade.YahooServiceFacade;
import com.eitax.recall.yahoo.model.YahooApi;
import com.eitax.recall.yahoo.model.YahooApiCall;
import com.eitax.recall.yahoo.rest.YahooRestService;
import com.eitax.recall.yahoo.service.YahooService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Component
public class YahooServiceFacadeImpl implements YahooServiceFacade {

	@Autowired
	private SharedService sharedService;
	@Autowired
	private YahooRestService yahooRestService;
	@Autowired
	private YahooService yahooService;

	private static final Logger log = LoggerFactory.getLogger(YahooServiceFacadeImpl.class);

	@Override
	public void registerAuctionItems() throws IOException {
		// TODO Auto-generated method stub
		int call = 0;
		try {
			YahooApiCall yac = yahooService.registerYahooApiCallAndFindYahooApi();
			YahooApi aa = yac.getYahooApi();
			List<Recall> recalls = sharedService.findRecallByDelFlag(0);
			for (Recall recall : recalls) {
				log.info(recall.getRecallName());
				final int INITIAL_ITEM_PAGE = 1;
				int pageCount = yahooRestService.retrieveAuctionSearchCount(aa.getAppid(), recall.getRecallName() , INITIAL_ITEM_PAGE, aa.getDelay(), aa.getUserAgent(), aa.getTimeout());
				++ call;
				for (int i = INITIAL_ITEM_PAGE; i < pageCount ; i++) {
					if (6 <= i) {
	 					break;
					}

					String json = yahooRestService.invokeAuctionSearch(aa.getAppid(), recall.getRecallName(), i, aa.getDelay(), aa.getUserAgent(), aa.getTimeout());
					++ call;
					JSONObject root = JSONObject.fromObject(json);
					JSONObject resultSet = root.getJSONObject("ResultSet");
					JSONArray itemArray = resultSet.getJSONObject("Result").getJSONArray("Item");

					for (int j = 0; j < itemArray.size(); j++) {
						JSONObject item = itemArray.getJSONObject(j);
						String auctionId = item.getString("AuctionID");
						String itemJson = yahooRestService.invokeAuctionItemSearch(aa.getAppid(), auctionId,aa.getDelay(),aa.getUserAgent(),aa.getTimeout());
						++ call;
						yahooService.registerItems(item, recall.getRecallId(),itemJson);
					}
				}
			}
			yahooService.updateApiCallCount(yac.getYahooApiCallId(), call);
		} catch (IOException e) {
			e.printStackTrace();
			log.error("error : ", e);
			throw e;
		}

	}

}
