package com.eitax.recall.amazon.dao;

import java.util.List;

import com.eitax.recall.amazon.model.AwsApi;

public interface AwsApiDAO {
	public abstract List<AwsApi> findAll();
}
