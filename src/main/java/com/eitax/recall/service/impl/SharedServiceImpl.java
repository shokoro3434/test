package com.eitax.recall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eitax.recall.dao.RecallDAO;
import com.eitax.recall.model.Recall;
import com.eitax.recall.service.SharedService;

@Component
public class SharedServiceImpl implements SharedService{

	@Autowired
	private RecallDAO recallDAO;
	
    public List<Recall> findRecallAll(){
    	return recallDAO.findAll();
    }
    public List<Recall> findRecallByDelFlag(Integer delFlag){
    	return recallDAO.findByDelFlag(delFlag);
    }
    public List<Recall> findRecallByEbayFlag(Integer ebayFlag){
    	return recallDAO.findByEbayFlag(ebayFlag);
    }

}
