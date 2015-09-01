package com.eitax.recall.yahoo.rest;

import java.io.IOException;

public interface YahooRestService {
	
	public abstract int retrieveAuctionSearchCount(String appid,String query,int page,int delay, String userAgent,int timeout) throws IOException;
	public abstract String invokeAuctionSearch(String appid,String query,int page,int delay, String userAgent,int timeout) throws IOException;
	public abstract String invokeAuctionItemSearch(String appid,String auctionId,int delay,String userAgent,int timeout) throws IOException;
}
