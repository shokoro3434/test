package com.eitax.recall.yahoo.dao;

import java.util.List;

import com.eitax.recall.yahoo.model.YahooApi;

public interface YahooApiDAO {
	public abstract List<YahooApi> findAll();
	public abstract YahooApi save(YahooApi ya);

}
