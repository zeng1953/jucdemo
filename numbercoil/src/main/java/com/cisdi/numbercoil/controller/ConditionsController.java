package com.cisdi.numbercoil.controller;

import com.cisdi.numbercoil.service.ConditionsService;
import com.cisdi.numbercoil.util.ResultGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConditionsController {
    private static final Logger logger = LoggerFactory.getLogger(ConditionsController.class);

    @Autowired
    ConditionsService conditionsService;

    //返回筛选条件选项
    //start页面
    @RequestMapping(value = "/conditions/{page}",method = RequestMethod.GET)
    public String showSelectConditions(@PathVariable("page") String page){
        logger.debug("conditions/{page} page:"+page);
        return ResultGenerator.genSuccessResult(conditionsService.getCoilConditions(page)).toString();
    }

}
