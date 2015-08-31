package com.eitax.recall.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eitax.recall.model.Recall;

public interface RecallRepository extends JpaRepository<Recall, Integer> {

    public List<Recall> findByDelFlag(Integer delFlag);
    public List<Recall> findByEbayFlag(Integer ebayFlag);


}
