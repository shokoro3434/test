package com.eitax.recall.amazon.rest;

public interface AmazonRestService {
	public abstract int retrieveItemCount(String keywords, int tagPage,String aWSAccessKeyId,String aWSSecretKey,String associateTag,int delay);
	public abstract String invokeItemSearch(String keywords, int tagPage,String aWSAccessKeyId,String aWSSecretKey,String associateTag,int delay);
	public abstract String invokeItemLookup(String itemId,String aWSAccessKeyId,String aWSSecretKey,String associateTag,int delay);
}
