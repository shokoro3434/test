package com.eitax.recall.ebay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eitax.recall.ebay.model.EbayItem;

public interface EbayItemRepository extends JpaRepository<EbayItem, Integer> {
	public abstract EbayItem findByItemId(String itemId);
	public abstract List<EbayItem> deleteByItemId(String itemId);

}
