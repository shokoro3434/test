package com.eitax.recall.amazon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eitax.recall.amazon.model.AmazonItemDetail;

public interface AmazonItemDetailRepository extends JpaRepository<AmazonItemDetail, Integer>{
	public abstract void deleteByAmazonItemId (Integer amazonItemId);
}
