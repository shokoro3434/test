package com.eitax.recall.amazon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eitax.recall.amazon.model.AmazonItem;

public interface AmazonItemRepository extends JpaRepository<AmazonItem, Integer> {

	public abstract List<AmazonItem> deleteByAsin(String asin);


}
