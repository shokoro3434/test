package com.eitan.recall.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.eitan.recall.model.Recall;

public interface RecallRepository extends JpaRepository<Recall, Integer> {

    public  Page<Recall> findByDelFlag(Integer delFlag,Pageable pageable);
    public  Page<Recall> findByEbayFlag(Integer ebayFlag,Pageable pageable);


}
