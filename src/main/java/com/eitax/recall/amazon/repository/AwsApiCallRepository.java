package com.eitax.recall.amazon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.eitax.recall.amazon.model.AwsApiCall;

public interface AwsApiCallRepository extends JpaRepository<AwsApiCall, Integer>{
	@Query("select a from AwsApiCall a where a.yyyymmdd = :yyyymmdd and delFlag = 0 order by a.cnt asc")
	public List<AwsApiCall> findByCallYyyymmdd(@Param("yyyymmdd")String yyyymmdd);
    @Modifying
    @Query("update AwsApiCall a set a.updated = sysdate,a.cnt = a.cnt + :cnt where a.awsApiCallId = :awsApiCallId")
    public void update(@Param("awsApiCallId")Integer awsApiCallId,@Param("cnt")Integer cnt);
}
