package com.eitan.recall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eitan.recall.model.AmazonItem;
import com.eitan.recall.repository.AmazonItemRepository;

@Component
public class AmazonItemService {
    @Autowired
    private AmazonItemRepository amazonItemRepository;
    
	public AmazonItem save (AmazonItem ai){
		return amazonItemRepository.save(ai);
	}
  
}
