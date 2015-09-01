package com.eitax.recall.yahoo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.eitax.recall.yahoo.dao.YahooApiDAO;
import com.eitax.recall.yahoo.model.YahooApi;
import com.eitax.recall.yahoo.repository.YahooApiRepository;

@Component
public class YahooApiDAOImpl implements YahooApiDAO {
	@Autowired
	private YahooApiRepository yahooApiRepository;

	public List<YahooApi> findAll(){
		return yahooApiRepository.findAll();
	}

	public YahooApi save(YahooApi ya){
		return yahooApiRepository.save(ya);
	}

}
