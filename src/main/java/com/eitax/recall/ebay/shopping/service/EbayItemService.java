package com.eitax.recall.ebay.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.eitax.recall.ebay.model.EbayItem;
import com.eitax.recall.ebay.repository.EbayItemRepository;

@Component
@Transactional
public class EbayItemService {
    @Autowired
    private EbayItemRepository ebayItemRepository;

	public List<EbayItem> findAll(){ 
		return ebayItemRepository.findAll();
	}
	public EbayItem save (EbayItem ei){
		return ebayItemRepository.save(ei);
	}
	public EbayItem findByItemId(String itemId){ 
		return ebayItemRepository.findByItemId(itemId);
	}
	public List<EbayItem> removeByItemId(String itemId){ 
		return ebayItemRepository.deleteByItemId(itemId);
	}

}
