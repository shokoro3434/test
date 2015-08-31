package com.eitax.recall.amazon.service;

import com.eitan.recall.model.AwsApiCall;
import com.eitan.recall.rest.amazon.xsd.Item;
import com.eitan.recall.rest.amazon.xsd.ItemLookupResponse;

public interface AmazonService {
	public abstract void registerItems(Item item,ItemLookupResponse ilr,Integer recallId);
    public abstract AwsApiCall registerAwsApiCallAndFindAwsApi();
	public abstract void updateApiCallCount(Integer awsApiCallId,Integer cnt);

}
