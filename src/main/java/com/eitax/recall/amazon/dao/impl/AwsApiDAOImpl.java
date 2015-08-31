package com.eitax.recall.amazon.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eitan.recall.model.AwsApi;
import com.eitan.recall.repository.AwsApiCallRepository;
import com.eitan.recall.repository.AwsApiRepository;
import com.eitax.recall.amazon.dao.AwsApiDAO;


@Component
public class AwsApiDAOImpl implements AwsApiDAO {
    @Autowired
    private AwsApiRepository awsApiRepository;

	@Override
	public List<AwsApi> findAll(){
		return awsApiRepository.findAll();
	}

}
