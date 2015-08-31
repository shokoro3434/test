package com.eitax.recall.yahoo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import com.eitax.recall.yahoo.model.YahooShoppingItem;

public interface YahooShoppingItemRepository extends JpaRepository<YahooShoppingItem, Long>{

	public abstract YahooShoppingItem save(YahooShoppingItem ysi);
	
}
