package com.cisdi.numbercoil.service;

import com.cisdi.numbercoil.bean.Children;
import com.cisdi.numbercoil.bean.FilterConditionsResult;
import com.cisdi.numbercoil.bean.coilDetail.*;
import com.cisdi.numbercoil.config.ConditionsConfig;
import com.cisdi.numbercoil.util.ConditionsHelper;
import com.cisdi.numbercoil.util.JsonHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ConditionsServiceImp implements ConditionsService {

    private static final Logger logger = LoggerFactory.getLogger(ConditionsServiceImp.class);

    @Autowired
    private ConditionsConfig conditionsConfig;



    @Override
    public ArrayList<String> getAllCoilConditions() {
        ArrayList<String> result;
        CoilMeasurementData coilMeasurementData = new CoilMeasurementData();
        CoilStatistics coilStatistics = new CoilStatistics();
        CoilTargetInformation coilTargetInformation = new CoilTargetInformation();
        DCAct dcAct = new DCAct();
        DCRef dcRef = new DCRef();
        FMAct fmAct = new FMAct();
        FMRef fmRef = new FMRef();
        Heating heating = new Heating();
        InstrumentTestResults instrumentTestResults = new InstrumentTestResults();
        ProductBasicInformation productBasicInformation = new ProductBasicInformation();
        RawMaterialsBasicInformation rawMaterialsBasicInformation = new RawMaterialsBasicInformation();
        RMAct rmAct = new RMAct();
        RMRef rmRef = new RMRef();
        TestResult testResult = new TestResult();

        result = ConditionsHelper.getObjectFields(coilMeasurementData,coilStatistics,coilTargetInformation,dcAct
            ,dcRef,fmRef,fmAct,heating,instrumentTestResults,productBasicInformation,rawMaterialsBasicInformation
            ,rmAct,rmRef,testResult);

        return result;
    }

    @Override
    public ArrayList<FilterConditionsResult> getCoilConditions(String page) {
        ArrayList<FilterConditionsResult> result = new ArrayList<>() ;
        if(null != page){
            RMAct rmAct = new RMAct();
            FMAct fmAct = new FMAct();
            DCAct dcAct = new DCAct();
            FilterConditionsResult filterConditionsResult1 = getFilterConditionsResult(rmAct,"RMAct","粗轧");
            result.add(filterConditionsResult1);
            FilterConditionsResult filterConditionsResult2 = getFilterConditionsResult(fmAct,"FMAct","精轧");
            result.add(filterConditionsResult2);
            FilterConditionsResult filterConditionsResult3 = getFilterConditionsResult(dcAct,"DCAct","卷取");
            result.add(filterConditionsResult3);
        }

        return result;
    }

    private FilterConditionsResult getFilterConditionsResult(Object obj,String id,String label){
        Map<String,String> conditons = conditionsConfig.getCondition();
        ArrayList<String> files = ConditionsHelper.getObjectFields(obj);
        List<Children> childrens = new ArrayList<>();
        for(String s:files){
            Children tempChildren = new Children(s,conditons.get(s));
            childrens.add(tempChildren);
        }
        FilterConditionsResult result = new FilterConditionsResult(id,label,childrens);
        return result;
    }
}
