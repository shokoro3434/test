package com.eitan.recall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.eitan.recall.model.YahooApiCall;
import com.eitan.recall.repository.YahooApiCallRepository;

@Transactional
@Component
public class YahooApiCallService {
	@Autowired
	private YahooApiCallRepository yahooApiCallRepository;

	
	public YahooApiCall save (YahooApiCall yac){
		return yahooApiCallRepository.save(yac);
	}
	public List<YahooApiCall> findByCallYyyymmdd(String callYyyymmdd){
		return yahooApiCallRepository.findByCallYyyymmdd(callYyyymmdd);
	}
	public void update(String yyyymmdd,Integer yahooApiId,Integer cnt){
		yahooApiCallRepository.update(yyyymmdd, yahooApiId, cnt);
	}
}	
