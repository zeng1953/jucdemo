package com.cisdi.numbercoil.bean;

import lombok.Data;

/**
 * 钢种号	steelgrade
 * 钢卷筛选条件	coilcond
 * 钢卷属性范围	coilfrom
 * 	coilto
 * 生产日期	producetimefrom
 * 	producetimeto
 * 钢卷号	coilno
 * 板坯号	coilnoparent
 * 板坯筛选条件	slabcond
 * 板坯属性范围	slabfrom
 * 	slabto
 * 当前页：	currentpage
 * 一页行数	pagesize
 */
@Data
public class Conditions {

    private	String	steelgrade;
    private	String	coilcond;
    private	Double	coilfrom;
    private	Double	coilto;
    private	String	producetimefrom;
    private	String	producetimeto;
    private	String	coilno;
    private	String	coilnoparent;
    private	String	slabcond;
    private	Double	slabfrom;
    private	Double	slabto;

}
