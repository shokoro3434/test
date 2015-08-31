package com.eitax.recall.amazon.dao;

import java.util.List;

import com.eitan.recall.model.AmazonItem;

public interface AmazonItemDAO {
	public abstract AmazonItem save (AmazonItem ai);
	public abstract List<AmazonItem> deleteByAsin(String asin);
}
