package com.cisdi.numbercoil.bean.coilDetail;

import lombok.Data;

/**
 * 表检结果
 * 	表面缺陷类型1	surfdefect1_type
 * 	表面缺陷类型1数量	surfdefect1_amount
 * 	表面缺陷类型1比率	surfdefect1_ratio
 * 	表面缺陷类型1位置	surfdefect1_location
 * 	表面缺陷类型2	surfdefect2_type
 * 	表面缺陷类型2数量	surfdefect2_amount
 * 	表面缺陷类型2比率	surfdefect2_ratio
 * 	表面缺陷类型2位置	surfdefect2_location
 * 	表面缺陷类型3	surfdefect3_type
 * 	表面缺陷类型3数量	surfdefect3_amount
 * 	表面缺陷类型3比率	surfdefect3_ratio
 * 	表面缺陷类型3位置	surfdefect3_location
 * 	表面缺陷类型4	surfdefect4_type
 * 	检验标准	SG_STD
 * 	质量终判结果	COMPLEX_DECIDE_CODE
 * 	氧化铁皮附着力	o_material_adhesion
 */
@Data
public class InstrumentTestResults {
    private	String	surfdefect1_type	;
    private	String	surfdefect1_amount	;
    private	String	surfdefect1_ratio	;
    private	String	surfdefect1_location	;
    private	String	surfdefect2_type	;
    private	String	surfdefect2_amount	;
    private	String	surfdefect2_ratio	;
    private	String	surfdefect2_location	;
    private	String	surfdefect3_type	;
    private	String	surfdefect3_amount	;
    private	String	surfdefect3_ratio	;
    private	String	surfdefect3_location	;
    private	String	surfdefect4_type	;
    private	String	SG_STD	;
    private	String	COMPLEX_DECIDE_CODE	;
    private	String	o_material_adhesion	;

}
