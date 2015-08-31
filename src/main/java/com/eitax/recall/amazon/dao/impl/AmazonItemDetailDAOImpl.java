package com.eitax.recall.amazon.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eitan.recall.model.AmazonItemDetail;
import com.eitan.recall.repository.AmazonItemDetailRepository;
import com.eitax.recall.amazon.dao.AmazonItemDetailDAO;

@Component
public class AmazonItemDetailDAOImpl implements AmazonItemDetailDAO{
    @Autowired
    private AmazonItemDetailRepository amazonItemDetailRepository;
    
	public AmazonItemDetail save (AmazonItemDetail aid){
		return amazonItemDetailRepository.save(aid);
	}
	public void deleteByAmazonItemId (Integer amazonItemId){
		amazonItemDetailRepository.deleteByAmazonItemId (amazonItemId);
	}

}