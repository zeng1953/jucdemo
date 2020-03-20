package com.cisdi.numbercoil.service;

import com.cisdi.numbercoil.bean.CoilInfo;
import com.cisdi.numbercoil.bean.Conditions;
import com.cisdi.numbercoil.bean.Result;
import com.cisdi.numbercoil.bean.coilDetail.*;
import com.cisdi.numbercoil.dao.CoilInfoDao;
import com.cisdi.numbercoil.util.ConditionsHelper;
import com.cisdi.numbercoil.util.ResultGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CoilInfoServiceImp implements CoilInfoService{

    private static final Logger logger = LoggerFactory.getLogger(CoilInfoServiceImp.class);

    @Autowired
    CoilInfoDao coilInfoDao;

    @Override
    public List<CoilInfo> findAll() {
        return coilInfoDao.findAll();
    }

    @Override
    public Result<List> findAll(Integer pageNumber, Integer pageSize) {
        List<CoilInfo> coilInfos = coilInfoDao.findAll(pageNumber,pageSize);
        Result<List> result = ResultGenerator.genSuccessResult(coilInfos);
        result.setTotal(coilInfoDao.getAllCoilCount());
        return result;
    }

    @Override
    public CoilInfo findById(String id) {
        return coilInfoDao.findById(id);
    }

    @Override
    public CoilInfo findByIdDifferentPage(String id, String page) {
        CoilInfo tempCoilInfo = findById(id);
        ArrayList<String> pageFields = getPageBasicFields(page);
        CoilInfo pageCoilDetail = pageCoilDetailOnlyNeed(tempCoilInfo,pageFields);
        return pageCoilDetail;
    }

    @Override
    public List<CoilInfo> findByIds(String[] ids) {
        return coilInfoDao.findByIds(ids);
    }

    @Override
    //将钢卷信息中的数组字段的值取平均值
    public Map<String,Object> findByIdsAve(String[] ids){
        List<CoilInfo> coilInfos = findByIds(ids);
        Map<String,Object> result = new HashMap<>();
        for(CoilInfo coilInfo:coilInfos){
            Map<String,Object> coil = coilInfo.getCoilDetail();
            Iterator<String> coilIte = coil.keySet().iterator();
            while ((coilIte.hasNext())){
                String cKey = coilIte.next();
                if(null != result.get(cKey)){
                    Object rValue = result.get(cKey);
                    if(rValue instanceof String){

                    }else if (rValue instanceof ArrayList){
                        ArrayList<Double> cValue = (ArrayList<Double>) coil.get(cKey);
                        ArrayList<Double> temprValue = (ArrayList<Double>)result.get(cKey);
                        ArrayList<Double> arrResult = new ArrayList<>();
                        if(cValue.size() >= temprValue.size()){
                            for(int x = 0;x < temprValue.size();x++){
                                arrResult.add(x,((cValue.get(x)+temprValue.get(x))/2.0));
                            }
                            for(int y = temprValue.size();y<cValue.size() ; y++){
                                arrResult.add(y,cValue.get(y));
                            }
                        }else{
                            for(int x = 0;x < cValue.size(); x++){
                                arrResult.add(x,((cValue.get(x)+temprValue.get(x))/2.0));
                            }
                            for(int y = cValue.size();y<temprValue.size() ; y++){
                                arrResult.add(y,temprValue.get(y));
                            }
                        }
                        result.put(cKey,arrResult);

                    }else{
                        logger.debug("type1 not found");
                    }
                }else{
                    Object rValue = coil.get(cKey);
                    if(rValue instanceof String){

                    }else if (rValue instanceof ArrayList){
                        result.put(cKey,coil.get(cKey));
                    }else{
                        logger.debug("type2 not found");
                    }
                }

            }
        }

        return  result;
    }

//    @Override
    //将钢卷信息中的数组字段的值取平均值
    public List<CoilInfo> findByIdsAve2(String[] ids){
        List<CoilInfo> coilInfos = findByIds(ids);
        for(CoilInfo coilInfo:coilInfos){
            Map<String,Object> coil = coilInfo.getCoilDetail();
            Map<String,Object> tempcoil = new HashMap<>();
            Iterator<String> coilIte = coil.keySet().iterator();
            while ((coilIte.hasNext())){
                String cKey = coilIte.next();
                if(null != coil.get(cKey)){
                    Object cValue = coil.get(cKey);
                    if(cValue instanceof String){
                        //tempcoil.put(cKey,cValue);
                    }else if (cValue instanceof ArrayList){
                        ArrayList<Double> doubles = (ArrayList<Double>)cValue;
                        Double dsum = 0.0;
                        for(Double d : doubles){
                            dsum = dsum + d;
                        }
                        tempcoil.put(cKey,dsum/(doubles.size()/1.0));
                    }else{
                        tempcoil.put(cKey,cValue);
                    }
                }else{

                }

            }
            coilInfo.setCoilDetail(tempcoil);
        }

        return  coilInfos;
    }

    @Override
    public List<CoilInfo> findByCondition(Conditions conditions) {
//        if((null == conditions.getCoilIdStart()) && (null == conditions.getCoilIdStop())
//                && (null == conditions.getCoilProductionDateStart()) && (null == conditions.getCoilProductionDateStop())
//                && (null == conditions.getCoilConditions())){
//            return coilInfoDao.findAll();
//        }
        return coilInfoDao.findByCondition(conditions);
    }

    @Override
    public Result<List> findByCondition(Integer pageNumber, Integer pageSize, Conditions conditions) {
        if(checkConditionsChange(conditions)){
            logger.debug("condition not init");
            return findAll(pageNumber,pageSize);
        }
//        if(null != conditions.getCoilno()){
//            String[] strings = new String[1];
//            strings[0] = conditions.getCoilno();
//            List<CoilInfo> coilInfos = findByIds(strings);
//            Result<List> result = ResultGenerator.genSuccessResult(coilInfos);
//            if(null != coilInfos){
//                result.setTotal(1L);
//            }else{
//                result.setTotal(0L);
//            }
//            return result;
//        }
        return coilInfoDao.findByCondition(pageNumber,pageSize,conditions);
    }

    private boolean checkConditionsChange(Conditions conditions){
        boolean flag = false;
        if(null == conditions.getSteelgrade() && null == conditions.getCoilcond()
                && null == conditions.getCoilfrom() && null == conditions.getCoilto()
                && null == conditions.getProducetimefrom() && null == conditions.getProducetimeto()
                && null == conditions.getCoilno() && null == conditions.getCoilnoparent()
                && null == conditions.getSlabcond() && null == conditions.getSlabfrom()
                && null == conditions.getSlabto()){
            flag =  true;
        }
        return flag;
    }
    //返回页面对应的字段
    private ArrayList<String> getPageBasicFields(String page){
        ArrayList<String> result = new ArrayList<>();
        //默认页面抬头钢卷基本信息
        ProductBasicInformation productBasicInformation = new ProductBasicInformation();
        RawMaterialsBasicInformation rawMaterialsBasicInformation = new RawMaterialsBasicInformation();
        result.addAll(ConditionsHelper.getObjectFields(productBasicInformation,rawMaterialsBasicInformation));
        switch (page){
            case "QualityData":
                CoilTargetInformation coilTargetInformation = new CoilTargetInformation();
                CoilMeasurementData coilMeasurementData = new CoilMeasurementData();
                CoilStatistics coilStatistics = new CoilStatistics();
                result.addAll(ConditionsHelper.getObjectFields(coilMeasurementData,coilStatistics,coilTargetInformation));
                break;
            case "InstrumentAndTest":
                InstrumentTestResults instrumentTestResults = new InstrumentTestResults();
                TestResult testResult = new TestResult();
                result.addAll(ConditionsHelper.getObjectFields(instrumentTestResults,testResult));
                break;
            case "ActMeasuredCurve":
                RMAct rmAct = new RMAct();
                FMAct fmAct = new FMAct();
                DCAct dcAct = new DCAct();
                result.addAll(ConditionsHelper.getObjectFields(rmAct,fmAct,dcAct));
                break;
            case "RefValue":
                RMRef rmRef = new RMRef();
                FMRef fmRef = new FMRef();
                DCRef dcRef = new DCRef();
                result.addAll(ConditionsHelper.getObjectFields(rmRef,fmRef,dcRef));
                break;
            case "Test":
                DCRef test = new DCRef();
                result.addAll(ConditionsHelper.getObjectFields(test));
                break;
            default:
        }

        logger.debug("PageFields:"+result.toString());
        return result;
    }


    private CoilInfo pageCoilDetailOnlyNeed(CoilInfo coilInfo,ArrayList<String> pageFields){
        Map<String,Object> coilDetail = coilInfo.getCoilDetail();
        Map<String,Object> pageCoilDetail = new HashMap<>();
        for(String key : pageFields){
            if(coilDetail.get(key) != null){
                pageCoilDetail.put(key,coilDetail.get(key));
            }
        }
        coilInfo.setCoilDetail(pageCoilDetail);
        return coilInfo;
    }
}
