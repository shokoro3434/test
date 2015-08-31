package com.eitax.recall.amazon.service;

import java.util.List;

import com.eitan.recall.model.AwsApi;
import com.eitan.recall.rest.amazon.xsd.Item;
import com.eitan.recall.rest.amazon.xsd.ItemLookupResponse;

public interface AmazonService {
	public abstract void registerItems(Item item,ItemLookupResponse ilr,Integer recallId);
    public abstract AwsApi registerAwsApiCallAndFindAwsApi();
}
