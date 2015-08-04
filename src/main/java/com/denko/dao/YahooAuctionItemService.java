package com.denko.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.denko.model.YahooAuctionItem;
import com.denko.repository.YahooAuctionItemRepository;

import java.util.List;

//@Service
@Transactional
@Component
public class YahooAuctionItemService {
	@Autowired
	YahooAuctionItemRepository yahooAuctionItemRepository;
	
	public YahooAuctionItem save (YahooAuctionItem yai){
		return yahooAuctionItemRepository.save(yai);
	}
	
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
