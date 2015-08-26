package com.eitax.recall.ebay.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eitax.recall.ebay.model.EbaySite;
import com.eitax.recall.ebay.repository.EbaySiteRepository;

@Component
public class EbaySiteService {
    @Autowired
    private EbaySiteRepository ebaySiteRepository;

	public List<EbaySite> findByDelFlag(Integer delFlag){ 
		return ebaySiteRepository.findByDelFlag(delFlag);
	}

}
