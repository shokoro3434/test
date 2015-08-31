package com.eitan.recall.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eitan.recall.model.AmazonItem;

public interface AmazonItemRepository extends JpaRepository<AmazonItem, Integer> {

	public abstract List<AmazonItem> deleteByAsin(String asin);


}
