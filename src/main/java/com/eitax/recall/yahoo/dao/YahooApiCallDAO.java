package com.eitax.recall.yahoo.dao;

import java.util.List;

import com.eitax.recall.yahoo.model.YahooApiCall;

public interface YahooApiCallDAO {
	public abstract YahooApiCall save (YahooApiCall yac);
	public abstract List<YahooApiCall> findByCallYyyymmdd(String callYyyymmdd);
	public abstract void updateCallCount(Integer yahooApiCallId,Integer cnt);
 
}
