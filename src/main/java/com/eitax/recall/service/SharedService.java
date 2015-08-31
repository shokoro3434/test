package com.eitax.recall.service;

import java.util.List;

import com.eitax.recall.model.Recall;

public interface SharedService {
    public abstract List<Recall> findRecallAll();
    public abstract List<Recall> findRecallByDelFlag(Integer delFlag);
    public abstract List<Recall> findRecallByEbayFlag(Integer ebayFlag);

}
