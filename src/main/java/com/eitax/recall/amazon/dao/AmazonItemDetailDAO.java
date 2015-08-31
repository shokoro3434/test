package com.eitax.recall.amazon.dao;

import com.eitax.recall.amazon.model.AmazonItemDetail;

public interface AmazonItemDetailDAO {
	public abstract AmazonItemDetail save (AmazonItemDetail aid);
	public abstract void deleteByAmazonItemId (Integer amazonItemId);
  
}