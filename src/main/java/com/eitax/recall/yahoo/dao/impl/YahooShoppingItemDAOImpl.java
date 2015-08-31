package com.eitax.recall.yahoo.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.eitax.recall.yahoo.dao.YahooShoppingItemDAO;
import com.eitax.recall.yahoo.model.YahooShoppingItem;
import com.eitax.recall.yahoo.repository.YahooShoppingItemRepository;

@Component
public class YahooShoppingItemDAOImpl implements YahooShoppingItemDAO {
	@Autowired
	private YahooShoppingItemRepository yahooShoppingItemRepository;
	
	@Transactional
	public YahooShoppingItem save (YahooShoppingItem yai){
		return yahooShoppingItemRepository.save(yai);
	}
}
