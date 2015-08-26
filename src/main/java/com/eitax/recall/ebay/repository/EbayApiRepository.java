package com.eitax.recall.ebay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eitax.recall.ebay.model.EbayApi;

public interface EbayApiRepository extends JpaRepository<EbayApi, Integer> {
}
