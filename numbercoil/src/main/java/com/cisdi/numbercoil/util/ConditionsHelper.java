package com.cisdi.numbercoil.util;

import com.cisdi.numbercoil.bean.CoilInfo;
import com.cisdi.numbercoil.bean.coilDetail.DCRef;
import com.cisdi.numbercoil.dao.CoilInfoDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ConditionsHelper {

    private static final Logger logger = LoggerFactory.getLogger(ConditionsHelper.class);

    /**
     * 獲取對象中有的字段，主要是給鋼卷返回曬下條件
     * @param objects
     * @return
     * @throws Exception
     */
    public static ArrayList<String> getObjectFields (Object... objects){
        ArrayList<String> al = new ArrayList<>();
        for(Object object : objects) {
            try {
                Field[] fs = object.getClass().getDeclaredFields();
//                for (Field f : fs) {
//                    al.add(f.getName());
//                }
                for (Field f : fs) {

                    String fieldtype = f.getType().toString();

                    if((fieldtype.indexOf("String") ) != -1){


                    }else if((fieldtype.indexOf("Double") )!= -1){

                    } else {
                        al.add(f.getName());
                    }
                }


            }catch (Exception e){
                logger.error("error !!! get Class Fields");
            }

        }
        return al;
    }



    public static Map<String,Object> getObjectFieldsAndInit (String str,Double y,Double dou,Object... objects) throws Exception{

        Map<String, Object> coilDetail = new HashMap<>();//钢卷明细


        for(Object object : objects) {
                logger.debug("object type:" + object.getClass().getName());
                Method method333 = object.getClass().getMethod("toString");
                String str333 = (String) method333.invoke(object);
                logger.debug("before str333=" + str333);

              //  String str = "3333";
                ArrayList<Double> tempdoubles = new ArrayList<>();
              //  Double y = 1.0;
                for(int x=0;x<10;x++){

                    tempdoubles.add(y);
                    y++;
                }
                Field[] fs = object.getClass().getDeclaredFields();
                for (Field f : fs) {
//                    String temp = changeUpNameFirst(f.getName());
//                    System.out.println("ffffff"+f.getType());
                    String ssss = f.getType().toString();
                    System.out.println((ssss.indexOf("String")  == -1));
                    if((ssss.indexOf("String") ) != -1){
//                        Method method2 = object.getClass().getMethod("set"+temp,String.class);
//                        method2.invoke(object,str);
                        System.out.println("String");
                        coilDetail.put(f.getName(),str);
                    }else if((ssss.indexOf("Double") )!= -1){
                        coilDetail.put(f.getName(),dou);
                    } else {
//                        Method method3 = object.getClass().getMethod("set"+temp,ArrayList.class);
//                        method3.invoke(object,tempdoubles);
                        System.out.println("Other");
                        coilDetail.put(f.getName(),tempdoubles);
                    }



                }

//                Method method3333 = object.getClass().getMethod("toString");
//                String str3333 = (String) method3333.invoke(object);
//                logger.debug("after str3333=" + str3333);


        }

        System.out.println(coilDetail.toString());
        return coilDetail;


    }


    private static String changeUpNameFirst(String name){
        char[] cs = name.toCharArray();
        cs[0]-=32;
        return String.valueOf(cs);
    }
}
