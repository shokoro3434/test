package com.eitax.recall.yahoo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.eitax.recall.yahoo.dao.YahooApiCallDAO;
import com.eitax.recall.yahoo.model.YahooApiCall;
import com.eitax.recall.yahoo.repository.YahooApiCallRepository;

@Component
public class YahooApiCallDAOImpl implements YahooApiCallDAO {
	@Autowired
	private YahooApiCallRepository yahooApiCallRepository;
	
	public YahooApiCall save (YahooApiCall yac){
		return yahooApiCallRepository.save(yac);
	}
	public List<YahooApiCall> findByCallYyyymmdd(String callYyyymmdd){
		return yahooApiCallRepository.findByCallYyyymmdd(callYyyymmdd);
	}
	public void updateCallCount(Integer yahooApiCallId,Integer cnt){
		yahooApiCallRepository.update(yahooApiCallId, cnt);
	}
}	
