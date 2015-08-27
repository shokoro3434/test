package com.eitax.recall.ebay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.eitax.recall.ebay.model.EbayApiCall;


public interface EbayApiCallRepository extends JpaRepository<EbayApiCall, Integer>{
	
	@Query("select a from EbayApiCall a where a.yyyymmdd = :yyyymmdd and delFlag = 0 order by a.cnt asc")
	public List<EbayApiCall> findByCallYyyymmdd(@Param("yyyymmdd")String yyyymmdd);
    @Modifying
    @Query("update EbayApiCall a set a.updated = sysdate,a.cnt = a.cnt + :cnt where a.ebayApiCallId = :ebayApiCallId")
    public void update(@Param("ebayApiCallId")Integer ebayApiCallId,@Param("cnt")Integer cnt);
}
