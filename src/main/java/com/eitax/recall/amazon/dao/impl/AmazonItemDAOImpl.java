package com.eitax.recall.amazon.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eitan.recall.model.AmazonItem;
import com.eitan.recall.repository.AmazonItemRepository;
import com.eitax.recall.amazon.dao.AmazonItemDAO;
import com.eitax.recall.amazon.xsd.Item;

@Component
public class AmazonItemDAOImpl implements AmazonItemDAO{
    @Autowired
    private AmazonItemRepository amazonItemRepository;
    
	public AmazonItem save (AmazonItem ai){
		return amazonItemRepository.save(ai);
	}

	@Override
	public List<AmazonItem> deleteByAsin(String asin) {
		// TODO Auto-generated method stub
		return amazonItemRepository.deleteByAsin(asin);
	}
  
}
