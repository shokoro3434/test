package com.eitan.recall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eitan.recall.model.YahooAuctionItem;
import com.eitan.recall.model.YahooShoppingItem;
import com.eitan.recall.repository.YahooShoppingItemRepository;

import java.util.List;

//@Service
@Transactional
@Component
public class YahooShoppingItemService {
	@Autowired
	private YahooShoppingItemRepository yahooShoppingItemRepository;
	
	public YahooShoppingItem save (YahooShoppingItem yai){
		return yahooShoppingItemRepository.save(yai);
	}
//	public YahooAuctionItem findByAuctionId (String auctionId){
//		return yahooAuctionItemRepository.findByAuctionId(auctionId);
//	}
//	public void removeByAuctionId(String auctionId){
//		yahooAuctionItemRepository.deleteByAuctionId(auctionId);
//	}

//	@Autowired
//	WhiskyRepository whiskyRepository;
//
//	public List<Whisky> findAll() {
//		return whiskyRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
//	}
//
//	public Whisky save(Whisky whisky) {
//		return whiskyRepository.save(whisky);
//	}

//	public void delete(Long id) {
//		whiskyRepository.delete(id);
//	}
//
//	public Whisky find(Long id) {
//		return whiskyRepository.findOne(id);
//	}
}
