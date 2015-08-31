package com.eitax.recall.yahoo.dao;

import com.eitax.recall.yahoo.model.YahooAuctionItem;

public interface YahooAuctionItemDAO {
	public abstract YahooAuctionItem save (YahooAuctionItem yai);
	public abstract YahooAuctionItem findByAuctionId (String auctionId);
	public abstract void removeByAuctionId(String auctionId);
}
