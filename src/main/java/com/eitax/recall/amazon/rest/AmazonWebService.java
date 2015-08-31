package com.eitax.recall.amazon.rest;

public interface AmazonWebService {
	public abstract String invokeItemSearch(String keywords, int tagPage);
	public abstract String invokeItemLookup(String itemId);
}
