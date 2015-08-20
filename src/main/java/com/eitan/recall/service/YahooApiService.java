package com.eitan.recall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.eitan.recall.model.YahooApi;
import com.eitan.recall.repository.YahooApiRepository;

@Transactional
@Component
public class YahooApiService {
	@Autowired
	private YahooApiRepository yahooApiRepository;

	public List<YahooApi> findAll(){
		return yahooApiRepository.findAll();
	}
	public YahooApi save(YahooApi ya){
		return yahooApiRepository.save(ya);
	}

}
