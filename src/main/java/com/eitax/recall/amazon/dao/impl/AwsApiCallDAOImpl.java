package com.eitax.recall.amazon.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eitan.recall.model.AwsApi;
import com.eitan.recall.model.AwsApiCall;
import com.eitan.recall.repository.AwsApiCallRepository;
import com.eitax.recall.amazon.dao.AwsApiCallDAO;


@Component
public class AwsApiCallDAOImpl implements AwsApiCallDAO {
    @Autowired
    private AwsApiCallRepository awsApiCallRepository;

	@Override
	public List<AwsApiCall> findByCallYyyymmdd(String yyyymmdd){
		return awsApiCallRepository.findByCallYyyymmdd(yyyymmdd);
	}

	@Override
	public AwsApiCall save(AwsApiCall aac) {
		// TODO Auto-generated method stub
		return awsApiCallRepository.save(aac);
	}

}
