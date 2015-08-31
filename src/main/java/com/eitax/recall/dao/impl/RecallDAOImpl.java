package com.eitax.recall.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eitax.recall.dao.RecallDAO;
import com.eitax.recall.model.Recall;
import com.eitax.recall.repository.RecallRepository;

@Component
public class RecallDAOImpl implements RecallDAO{

	@Autowired
	private RecallRepository recallRepository;
    
    public  List<Recall> findAll(){
    	return recallRepository.findAll();
    }

    public  List<Recall> findByDelFlag(Integer delFlag){
    	return recallRepository.findByDelFlag(delFlag);
    }
    public  List<Recall> findByEbayFlag(Integer ebayFlag){
    	return recallRepository.findByEbayFlag(ebayFlag);
    }
    
}
