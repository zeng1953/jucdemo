package com.cisdi.numbercoil.service;

import com.cisdi.numbercoil.bean.CoilInfo;
import com.cisdi.numbercoil.bean.Conditions;
import com.cisdi.numbercoil.bean.Result;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface CoilInfoService {
    List<CoilInfo> findAll();//获取所有
    Result<List> findAll(Integer pageNumber,Integer pageSize);
    CoilInfo findById(String id);//通过钢卷id查询
    CoilInfo findByIdDifferentPage(String id,String page);//不同页面返回需要的钢卷信息字段
    List<CoilInfo> findByIds(String[] ids);//通过多个id查找
    Map<String,Object> findByIdsAve(String[] ids);
    List<CoilInfo> findByIdsAve2(String[] ids);
    List<CoilInfo> findByCondition(Conditions conditions);//根据条件查找
    Result<List> findByCondition(Integer pageNumber,Integer pageSize,Conditions conditions);//根据条件查找
}
