package com.eitax.recall.yahoo.dao;

import java.util.List;

import com.eitax.recall.yahoo.model.YahooAuctionItem;

public interface YahooAuctionItemDAO {
	public abstract YahooAuctionItem save (YahooAuctionItem yai);
	public abstract YahooAuctionItem findByAuctionId (String auctionId);
	public abstract List<YahooAuctionItem> deleteByAuctionId(String auctionId);
}
