package com.eitax.recall.ebay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eitax.recall.ebay.model.EbaySite;

public interface EbaySiteRepository extends JpaRepository<EbaySite, Integer> {
	public abstract List<EbaySite> findByDelFlag(Integer delFlag);

}
