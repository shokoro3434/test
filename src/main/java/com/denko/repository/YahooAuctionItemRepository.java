package com.denko.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import com.denko.model.YahooAuctionItem;

public interface YahooAuctionItemRepository extends JpaRepository<YahooAuctionItem, Long>{

	public abstract YahooAuctionItem save(YahooAuctionItem yai);
	public abstract YahooAuctionItem findByAuctionId(String auctionId);

}
