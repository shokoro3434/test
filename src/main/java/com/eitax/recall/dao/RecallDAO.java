package com.eitax.recall.dao;

import java.util.List;

import com.eitax.recall.model.Recall;

public interface RecallDAO {
    public abstract List<Recall> findAll();
    public abstract List<Recall> findByDelFlag(Integer delFlag);
    public abstract List<Recall> findByEbayFlag(Integer ebayFlag);

}
