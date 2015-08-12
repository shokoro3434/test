package com.eitan.recall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eitan.recall.model.Recall;
import com.eitan.recall.repository.RecallRepository;

@Component
@Transactional
public class RecallService {
    @Autowired
    private RecallRepository recallRepository;
    
    public  Page<Recall> findAll(Pageable pageable){
    	return recallRepository.findAll(pageable);
    }

    public  Page<Recall> findByDelFlag(Integer delFlag,Pageable pageable){
    	return recallRepository.findByDelFlag(delFlag, pageable);
    }
    
}
