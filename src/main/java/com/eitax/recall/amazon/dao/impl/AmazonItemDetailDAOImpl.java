package com.eitax.recall.amazon.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eitax.recall.amazon.dao.AmazonItemDetailDAO;
import com.eitax.recall.amazon.model.AmazonItemDetail;
import com.eitax.recall.amazon.repository.AmazonItemDetailRepository;

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