package com.eitax.recall.yahoo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.eitax.recall.yahoo.model.YahooApi;

public interface YahooApiRepository extends JpaRepository<YahooApi, Integer> {
}
