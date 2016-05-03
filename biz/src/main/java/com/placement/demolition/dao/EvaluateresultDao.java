package com.placement.demolition.dao;

import com.placement.demolition.model.Evaluateresult;

public interface EvaluateresultDao {
    int deleteByPrimaryKey(Long id);

    int insert(Evaluateresult record);

    int insertSelective(Evaluateresult record);

    Evaluateresult selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Evaluateresult record);

    int updateByPrimaryKey(Evaluateresult record);
}