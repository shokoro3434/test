package com.eitax.recall.ebay.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.eitax.recall.ebay.model.EbayApiCall;
import com.eitax.recall.ebay.repository.EbayApiCallRepository;


@Transactional
@Component
public class EbayApiCallService {
	@Autowired
	private EbayApiCallRepository ebayApiCallRepository;

	
	public EbayApiCall save (EbayApiCall yac){
		return ebayApiCallRepository.save(yac);
	}
	public List<EbayApiCall> findByCallYyyymmdd(String callYyyymmdd){
		return ebayApiCallRepository.findByCallYyyymmdd(callYyyymmdd);
	}
	public void update(Integer ebayApiCallId,Integer cnt){
		ebayApiCallRepository.update(ebayApiCallId, cnt);
	}
}	
