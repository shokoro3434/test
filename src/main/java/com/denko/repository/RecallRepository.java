package com.denko.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import com.denko.model.Recall;

public interface RecallRepository extends Repository<Recall, String> {

    public  Page<Recall> findAll(Pageable pageable);


}
