package com.cisdi.numbercoil.dao;

import com.cisdi.numbercoil.bean.CoilInfo;
import com.cisdi.numbercoil.bean.Conditions;
import com.cisdi.numbercoil.bean.Result;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CoilInfoDao {
    List<CoilInfo> findAll();//获取所有
    List<CoilInfo> findAll(Integer pageNumber,Integer pageSize);//获取所有
    CoilInfo findById(String id);//通过钢卷id查询
    List<CoilInfo> findByIds(String[] ids);//通过多个id查找
    List<CoilInfo> findByCondition(Conditions conditions);//根据条件查找
    Long getAllCoilCount();
    void saveCoil(CoilInfo coilInfo);
    Result<List> findByCondition(Integer pageNumber, Integer pageSize, Conditions conditions);//根据条件查找
}
