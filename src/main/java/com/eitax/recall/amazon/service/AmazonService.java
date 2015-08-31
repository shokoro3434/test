package com.eitax.recall.amazon.service;

import com.eitan.recall.rest.amazon.xsd.Item;
import com.eitan.recall.rest.amazon.xsd.ItemLookupResponse;

public interface AmazonService {
	public abstract void registerItems(Item item,ItemLookupResponse ilr,Integer recallId);
}
