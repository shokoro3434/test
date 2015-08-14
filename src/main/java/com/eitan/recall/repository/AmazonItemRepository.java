package com.eitan.recall.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.eitan.recall.model.AmazonItem;

public interface AmazonItemRepository extends JpaRepository<AmazonItem, Integer> {



}
