package com.denko.repository;

import org.springframework.data.repository.Repository;

import com.denko.model.YahooAuctionItem;

public interface YahooAuctionItemRepository extends Repository<YahooAuctionItem, String>{

	public abstract YahooAuctionItem save(YahooAuctionItem yai);
	

}
