package com.eitax.recall.yahoo.service;

import com.eitax.recall.yahoo.model.YahooApiCall;

public interface YahooService {
	public abstract void registerItems(String json,Integer recallId,String itemJson);
    public abstract YahooApiCall registerYahooApiCallAndFindYahooApi();
	public abstract void updateApiCallCount(Integer yahooApiCallId,Integer cnt);

}
