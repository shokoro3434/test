package com.eitax.recall.yahoo.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eitax.recall.yahoo.dao.YahooAuctionItemDAO;
import com.eitax.recall.yahoo.model.Category;
import com.eitax.recall.yahoo.model.YahooAuctionItem;
import com.eitax.recall.yahoo.repository.YahooAuctionItemRepository;

import java.util.List;

@Component
public class YahooAuctionItemDAOImpl implements YahooAuctionItemDAO {
	@Autowired
	private YahooAuctionItemRepository yahooAuctionItemRepository;
	
	@Transactional
	public YahooAuctionItem save (YahooAuctionItem yai){
		return yahooAuctionItemRepository.save(yai);
	}
	public YahooAuctionItem findByAuctionId (String auctionId){
		return yahooAuctionItemRepository.findByAuctionId(auctionId);
	}
	@Transactional
	public void removeByAuctionId(String auctionId){
		yahooAuctionItemRepository.deleteByAuctionId(auctionId);
	}
}
