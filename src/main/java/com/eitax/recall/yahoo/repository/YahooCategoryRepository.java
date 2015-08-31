package com.eitax.recall.yahoo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import com.eitax.recall.yahoo.model.Category;
import com.eitax.recall.yahoo.model.YahooAuctionItem;

public interface YahooCategoryRepository extends JpaRepository<Category, Integer>{

//	public abstract YahooAuctionItem save(YahooAuctionItem yai);
//	public abstract YahooAuctionItem findByAuctionId(String auctionId);
//	public abstract List<YahooAuctionItem> deleteByAuctionId(String auctionId);
	public abstract void deleteByYCategoryId(Integer yCategoryId);
}
