package com.denko.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import com.denko.model.Category;
import com.denko.model.YahooAuctionItem;

public interface YahooCategoryRepository extends JpaRepository<Category, Integer>{

//	public abstract YahooAuctionItem save(YahooAuctionItem yai);
//	public abstract YahooAuctionItem findByAuctionId(String auctionId);
//	public abstract List<YahooAuctionItem> deleteByAuctionId(String auctionId);
	public abstract void deleteByYCategoryId(Integer yCategoryId);
}
