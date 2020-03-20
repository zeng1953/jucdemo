package com.cisdi.numbercoil.dao;

import com.cisdi.numbercoil.bean.CoilInfo;
import com.cisdi.numbercoil.bean.Conditions;
import com.cisdi.numbercoil.bean.Result;
import com.cisdi.numbercoil.util.ResultGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CoilInfoDaoImp implements CoilInfoDao{

    private static final Logger logger = LoggerFactory.getLogger(CoilInfoDaoImp.class);

    @Autowired
    private MongoTemplate mongoTemplate;

    private static final String COLLECTIONNAME = "coilInfo";

    @Override
    public List<CoilInfo> findAll() {

        return mongoTemplate.findAll(CoilInfo.class,COLLECTIONNAME);
    }

    @Override
    public List<CoilInfo> findAll(Integer pageNumber, Integer pageSize) {
        Query query = new Query();
        query.skip((pageNumber-1)*pageSize).limit(pageSize);
        List<CoilInfo> list = mongoTemplate.find(query,CoilInfo.class,COLLECTIONNAME);
        for(CoilInfo coilInfo : list){
            logger.debug("!!!coil!!!"+coilInfo.toString());
        }
        return list;
    }

    @Override
    public CoilInfo findById(String id) {
        Query query = new Query(Criteria.where("coilNo").is(id));
        return mongoTemplate.findOne(query,CoilInfo.class,COLLECTIONNAME);
    }

    @Override
    public List<CoilInfo> findByIds(String[] ids) {
        List<CoilInfo> list = new ArrayList<>();
        for(String id : ids){
            CoilInfo tempCoilInfo = findById(id);
            if(null != tempCoilInfo){
                list.add(tempCoilInfo);
            };
        }
        return list;
    }

    @Override
    public List<CoilInfo> findByCondition(Conditions conditions) {

        Query query = new Query();
//        for(String str : conditions.getCoilConditions()){
//            query.addCriteria(Criteria.where("coilDetail."+str).exists(true));
//        }
        List<CoilInfo> list = mongoTemplate.find(query,CoilInfo.class,COLLECTIONNAME);
        return list;
    }

    @Override
    public Long getAllCoilCount() {
        Query query = new Query();
        logger.debug("coilCount:"+mongoTemplate.count(query,CoilInfo.class,COLLECTIONNAME));
        return mongoTemplate.count(query,CoilInfo.class,COLLECTIONNAME);
    }

    @Override
    public void saveCoil(CoilInfo coilInfo) {
        logger.debug("coilInfo："+coilInfo.toString());
        mongoTemplate.save(coilInfo,COLLECTIONNAME);
    }

    @Override
    public Result<List> findByCondition(Integer pageNumber, Integer pageSize, Conditions conditions) {
        System.out.println("i am here");
        Query query = conditionsToQuery(conditions);
        Long totalNumber = getTotalValue(query);
        query.skip((pageNumber-1)*pageSize).limit(pageSize);
        List<CoilInfo> coilInfos = mongoTemplate.find(query,CoilInfo.class,COLLECTIONNAME);
        Result<List> result = ResultGenerator.genSuccessResult(coilInfos);
        result.setTotal(totalNumber);
        return result;
    }

    private Long getTotalValue(Query query){
        return mongoTemplate.count(query,CoilInfo.class,COLLECTIONNAME);
    }

    private Query conditionsToQuery(Conditions conditions){
        Query query = new Query();
        if(null != conditions.getCoilno()){
            query.addCriteria(Criteria.where("coilNo").is(conditions.getCoilno()));
            return query;
        }else{
            if(null != conditions.getCoilcond()){
                String coilcond = conditions.getCoilcond();
                String str = "";
                switch (coilcond){
                    case "thick":
                        str = "stripthick";
                        break;
                    case "width":
                        str = "stripwidth";
                        break;
                    case "length":
                        str = "striplength";
                        break;
                    case "weight":
                        str = "stripweight";
                        break;
                        default:
                }
                query.addCriteria(Criteria.where("coilDetail."+str).exists(true).gte(conditions.getCoilfrom()).lte(conditions.getCoilto()));

            }
            if(null != conditions.getSlabcond()){
                String slabcond = conditions.getSlabcond();
                String slabstr = "";
                switch (slabcond){
                    case "thick":
                        slabstr = "slabthick";
                        break;
                    case "width":
                        slabstr = "slabwidth";
                        break;
                    case "length":
                        slabstr = "slablength";
                        break;
                    case "weight":
                        slabstr = "slabweight";
                        break;
                    default:
                }
                query.addCriteria(Criteria.where("coilDetail."+slabstr).exists(true).gte(conditions.getSlabfrom()).lte(conditions.getSlabto()));

            }
            if(null != conditions.getSteelgrade()){
                String steelgrade = conditions.getSteelgrade();
                query.addCriteria(Criteria.where("coilDetail.steelgrade").exists(true).is(steelgrade));
            }
            if(null != conditions.getCoilnoparent()){
                String coilnoparent = conditions.getCoilnoparent();
                query.addCriteria(Criteria.where("coilDetail.coilnoparent").exists(true).is(coilnoparent));
            }

            return query;
        }
    }


}