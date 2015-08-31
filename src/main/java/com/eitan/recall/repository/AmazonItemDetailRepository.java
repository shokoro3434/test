package com.eitan.recall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eitan.recall.model.AmazonItemDetail;

public interface AmazonItemDetailRepository extends JpaRepository<AmazonItemDetail, Integer>{
	public abstract void deleteByAmazonItemId (Integer amazonItemId);
}
