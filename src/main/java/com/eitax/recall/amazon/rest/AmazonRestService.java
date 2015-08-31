package com.eitax.recall.amazon.rest;

import java.io.IOException;

import com.eitan.recall.rest.amazon.xsd.ItemLookupResponse;
import com.eitan.recall.rest.amazon.xsd.ItemSearchResponse;

public interface AmazonRestService {
	public abstract int retrieveItemCount(String keywords, int tagPage,String aWSAccessKeyId,String aWSSecretKey,String associateTag,int delay,String userAgent) throws IOException;

	public abstract ItemSearchResponse invokeItemSearch(String keywords, int tagPage,String aWSAccessKeyId,String aWSSecretKey,String associateTag,int delay,String userAgent) throws IOException;

	public abstract ItemLookupResponse invokeItemLookup(String itemId,String aWSAccessKeyId,String aWSSecretKey,String associateTag,int delay,String userAgent) throws IOException;
}
