package com.eitax.recall.yahoo.service.impl;

import java.util.List;
import java.util.TimeZone;

import javax.transaction.Transactional;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eitax.recall.yahoo.dao.YahooApiCallDAO;
import com.eitax.recall.yahoo.dao.YahooApiDAO;
import com.eitax.recall.yahoo.dao.YahooAuctionItemDAO;
import com.eitax.recall.yahoo.model.YahooApi;
import com.eitax.recall.yahoo.model.YahooApiCall;
import com.eitax.recall.yahoo.model.YahooAuctionItem;
import com.eitax.recall.yahoo.service.YahooService;

import net.sf.json.JSONObject;

@Component
public class YahooServiceImpl implements YahooService {

	@Autowired
	private YahooAuctionItemDAO yahooAuctionItemDAO;
	@Autowired
	private YahooApiCallDAO yahooApiCallDAO;
	@Autowired
	private YahooApiDAO yahooApiDAO;

	@Override
	@Transactional
	public void registerItems(JSONObject item, Integer recallId,String itemJson) {

		String auctionId = item.getString("AuctionID");
		yahooAuctionItemDAO.deleteByAuctionId(auctionId);

		System.err.println("###############"+auctionId);
		JSONObject itemRoot = JSONObject.fromObject(itemJson);
		int storeFlag = itemRoot.getJSONObject("ResultSet").getJSONObject("Result")
				.getJSONObject("Option").has("StoreIcon") ? 1 : 0;

		YahooAuctionItem tmp = yahooAuctionItemDAO.findByAuctionId(auctionId);
		System.err.println("FIND");
		System.err.println("DELETE");

		YahooAuctionItem yai = new YahooAuctionItem();
		yai.setTitle(item.getString("Title"));
		yai.setEndTime(item.getString("EndTime"));
		yai.setCurrentPrice(item.getInt("CurrentPrice"));
		yai.setAuctionId(item.getString("AuctionID"));
		yai.setCategoryId(item.getString("CategoryId"));
		yai.setBidOrBuy(item.has("BidOrBuy") ? item.getInt("BidOrBuy") : 0);
		yai.setSellerId(item.getJSONObject("Seller").getString("Id"));
		yai.setAuctionItemUrl(item.getString("AuctionItemUrl"));
		yai.setRecallId(recallId);
		yai.setStoreFlag(storeFlag);
		yai.setBids(item.getInt("Bids"));
		yai.setMarkId(tmp != null ? tmp.getMarkId() : 2);
		yai.setAuctionId(auctionId);
		
		yahooAuctionItemDAO.save(yai);
	}

	@Override
	@Transactional
	public YahooApiCall registerYahooApiCallAndFindYahooApi() {
		DateTime now = DateTime.now().withZone(DateTimeZone.forTimeZone(TimeZone.getTimeZone("JST")))
				.withHourOfDay(0).withMinuteOfHour(0).withSecondOfMinute(0).withMillisOfSecond(0);
		String yyyyMMdd = now.toString("yyyyMMdd");
		List<YahooApiCall> list = yahooApiCallDAO.findByCallYyyymmdd(now.toString("yyyyMMdd"));
		if (0 == list.size()) {
			List<YahooApi> yahooApiList = yahooApiDAO.findAll();
			for (YahooApi ya : yahooApiList) {
				YahooApiCall yap = new YahooApiCall();
				yap.setCnt(0);
				yap.setYyyymmdd(yyyyMMdd);
				yap.setDelFlag(0);
				yap.setYahooApi(ya);
				yahooApiCallDAO.save(yap);
			}
			list = yahooApiCallDAO.findByCallYyyymmdd(now.toString("yyyyMMdd"));
		}
		YahooApiCall apc = list.get(0);
		return apc;
	}

	@Override
	@Transactional
	public void updateApiCallCount(Integer yahooApiCallId, Integer cnt) {
		yahooApiCallDAO.updateCallCount(yahooApiCallId, cnt);
	}

}
