package com.eitax.recall.amazon.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eitan.recall.model.AmazonItem;
import com.eitan.recall.model.AmazonItemDetail;
import com.eitan.recall.repository.AmazonItemDetailRepository;

@Component
public class AmazonItemDetailService {
    @Autowired
    private AmazonItemDetailRepository amazonItemDetailRepository;
    
	public AmazonItemDetail save (AmazonItemDetail aid){
		return amazonItemDetailRepository.save(aid);
	}
  
}