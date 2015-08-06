package com.denko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.denko.model.Recall;
import com.denko.repository.RecallRepository;

@Component
public class RecallService {
    @Autowired
//  @Qualifier("recallRepository")
    RecallRepository recallRepository;
    
    public  Page<Recall> findAll(Pageable pageable){
    	return recallRepository.findAll(pageable);
    }

    public  Page<Recall> findByDelFlag(Long delFlag,Pageable pageable){
    	return recallRepository.findByDelFlag(delFlag, pageable);
    }
    
}
