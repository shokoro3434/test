package com.eitax.recall.amazon.rest;

public interface AmazonWebService {
	public abstract String invokeItemSearch(String keywords, int tagPage,String aWSAccessKeyId,String aWSSecretKey,String associateTag);
	public abstract String invokeItemLookup(String itemId,String aWSAccessKeyId,String aWSSecretKey,String associateTag);
}
