package com.eitan.recall.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eitan.recall.model.YahooAuctionItem;

public interface YahooAuctionItemRepository extends JpaRepository<YahooAuctionItem, Integer>{

	public abstract YahooAuctionItem save(YahooAuctionItem yai);
	public abstract YahooAuctionItem findByAuctionId(String auctionId);
	public abstract List<YahooAuctionItem> deleteByAuctionId(String auctionId);
	
}
