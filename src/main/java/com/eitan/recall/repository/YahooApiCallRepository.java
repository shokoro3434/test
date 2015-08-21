package com.eitan.recall.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.eitan.recall.model.YahooApiCall;

public interface YahooApiCallRepository extends JpaRepository<YahooApiCall, Integer>{
	
	@Query("select a from YahooApiCall a where a.yyyymmdd = :yyyymmdd order by a.cnt asc")
	public List<YahooApiCall> findByCallYyyymmdd(@Param("yyyymmdd")String yyyymmdd);
    @Modifying
    @Query("update YahooApiCall a set a.updated = sysdate,a.cnt = a.cnt + :cnt where a.yahooApiCallId = :yahooApiCallId")
    public void update(@Param("yahooApiCallId")Integer yahooApiCallId,@Param("cnt")Integer cnt);
}
