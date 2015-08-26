package com.eitax.recall.ebay.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eitan.recall.model.YahooAuctionItem;
import com.eitax.recall.ebay.model.EbayApi;
import com.eitax.recall.ebay.repository.EbayApiRepository;

@Component
public class EbayApiService {
    @Autowired
    private EbayApiRepository ebayApiRepository;

	public List<EbayApi> findAll(){ 
		return ebayApiRepository.findAll();
	}

}
