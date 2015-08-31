package com.eitax.recall.amazon.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eitax.recall.amazon.dao.AwsApiDAO;
import com.eitax.recall.amazon.model.AwsApi;
import com.eitax.recall.amazon.repository.AwsApiCallRepository;
import com.eitax.recall.amazon.repository.AwsApiRepository;


@Component
public class AwsApiDAOImpl implements AwsApiDAO {
    @Autowired
    private AwsApiRepository awsApiRepository;

	@Override
	public List<AwsApi> findAll(){
		return awsApiRepository.findAll();
	}

}
