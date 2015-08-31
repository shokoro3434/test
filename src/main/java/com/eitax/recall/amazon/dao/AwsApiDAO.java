package com.eitax.recall.amazon.dao;

import java.util.List;

import com.eitan.recall.model.AwsApi;

public interface AwsApiDAO {
	public abstract List<AwsApi> findAll();
}
