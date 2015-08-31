package com.eitax.recall.amazon.dao;

import java.util.List;

import com.eitan.recall.model.AwsApiCall;

public interface AwsApiCallDAO {
	public abstract List<AwsApiCall> findByCallYyyymmdd(String yyyymmdd);
	public abstract AwsApiCall save(AwsApiCall aac);
	public abstract void update(Integer awsApiCallId,Integer cnt);
}
