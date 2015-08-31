package com.eitax.recall.amazon.dao;

import java.util.List;

import com.eitax.recall.amazon.model.AmazonItem;

public interface AmazonItemDAO {
	public abstract AmazonItem save (AmazonItem ai);
	public abstract List<AmazonItem> deleteByAsin(String asin);
}
