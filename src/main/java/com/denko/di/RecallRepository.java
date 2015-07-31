package com.denko.di;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

public interface RecallRepository extends Repository<Recall, String> {

    Page<Recall> findAll(Pageable pageable);


}
