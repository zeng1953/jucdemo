package com.cisdi.numbercoil.controller;

import com.cisdi.numbercoil.bean.CoilInfo;
import com.cisdi.numbercoil.bean.Conditions;
import com.cisdi.numbercoil.service.CoilInfoService;
import com.cisdi.numbercoil.util.ResultGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class CoilInfoController {

    private static final Logger logger = LoggerFactory.getLogger(CoilInfoController.class);

    @Autowired
    CoilInfoService coilInfoService;


    //展示所有钢卷信息
    @RequestMapping(value = "/start/coils",method = RequestMethod.GET)
    public String showAllCoils(){
        logger.debug("showAllCoils()");
        List<CoilInfo> coilInfos = coilInfoService.findAll();
        return  ResultGenerator.<List>genSuccessResult(coilInfos).toString();
    }

    //展示所有钢卷信息
    @RequestMapping(value = "/start/coils/{pageNumber}/{pageSize}",method = RequestMethod.GET)
    public String showCoilsPagination(@PathVariable("pageNumber") int pageNumber,@PathVariable("pageSize") int pageSize){
        logger.debug("pageNumber:"+pageNumber+"---"+"pageSize:"+pageSize);
        return  coilInfoService.findAll(pageNumber,pageSize).toString();
    }

    //根据筛选添加展示钢卷信息
    @RequestMapping(value = "/start/coilsByConditions",method = RequestMethod.GET)
    public String showCoilsByConditions(Conditions conditions){
        logger.debug("conditions"+conditions.toString());
        List<CoilInfo> coilInfos = coilInfoService.findByCondition(conditions);
        return  ResultGenerator.<List>genSuccessResult(coilInfos).toString();
    }



    //返回一批钢卷信息
    @RequestMapping(value = "/start/coils/{ids}",method = RequestMethod.GET)
    public String showCoilsByIds(@PathVariable("ids") String[] ids){
        if(ids.length!=0){
            for(String ts : ids){
                logger.debug("ids:"+ts);
            }
        }
        Map<String,Object> map = coilInfoService.findByIdsAve(ids);
        return ResultGenerator.<Map>genSuccessResult(map).toString();
    }

    //返回一条钢卷信息
    @RequestMapping(value = "/start/coil/{id}",method = RequestMethod.GET)
    public String showCoilsById(@PathVariable("id") String id){
        logger.debug("id:"+id);
        CoilInfo coilInfo = coilInfoService.findById(id);
        return ResultGenerator.<CoilInfo>genSuccessResult(coilInfo).toString();
    }

    //返回一条钢卷信息
    @RequestMapping(value = "/coil/{page}/{id}",method = RequestMethod.GET)
    public String showCoilsByIdDifferentPage(@PathVariable("page") String page,@PathVariable("id") String id){
        logger.debug("page:"+page+"---"+"id:"+id);
        CoilInfo coilInfo = coilInfoService.findByIdDifferentPage(id,page);
        return ResultGenerator.<CoilInfo>genSuccessResult(coilInfo).toString();
    }


}
