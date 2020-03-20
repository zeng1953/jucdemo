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

@RestController
public class CoilController {

    private static final Logger logger = LoggerFactory.getLogger(CoilInfoController.class);

    @Autowired
    CoilInfoService coilInfoService;


    @RequestMapping(value = "/wugang/start/coils",method = RequestMethod.GET)
    public String getCoil(@RequestParam(name = "currentpage",required = true,defaultValue = "1")int pageNumber,
                          @RequestParam(name = "pagesize",required = true,defaultValue = "10")int pageSize,
                          Conditions conditions){
        logger.debug("conditons---"+conditions.toString());
        logger.debug("currentpage:"+pageNumber+"pagesize"+pageSize);
        return coilInfoService.findByCondition(pageNumber,pageSize,conditions).toString();
    }

    @RequestMapping(value = "/test/{page}/coil",method = RequestMethod.GET)
    public String getDifferentPageCoil(@RequestParam(name = "id",required = true)String id,
                                       @PathVariable(value = "page")String page){
        return "{page}/coil";
    }

    //返回一批钢卷信息
    @RequestMapping(value = "/wugang/page3/coils",method = RequestMethod.GET)
    public String showCoilsByIds(@RequestParam(name = "coilnolist",required = true) String[] ids){
        if(ids.length!=0){
            for(String ts : ids){
                logger.debug("ids:"+ts);
            }
        }
//        Map<String,Object> map = coilInfoService.findByIdsAve(ids);
//        return ResultGenerator.<Map>genSuccessResult(map).toString();
        List<CoilInfo> list = coilInfoService.findByIdsAve2(ids);
        return ResultGenerator.<List>genSuccessResult(list).toString();
    }
}
