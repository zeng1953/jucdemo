package com.cisdi.numbercoil.bean.coilDetail;

import lombok.Data;

/**
 *
 * 成品基本信息
 *
 * 母卷号 	coilnoparent
 * 钢种号	 	steelgrade
 * 出钢记号（牌号）coilno
 * 带钢厚度	 	stripthick
 * 带钢宽度	 	stripwidth
 * 带钢凸度	 	stripcrown
 * 带钢长度	 	striplength
 * 钢卷内径	 	innerdia
 * 钢卷外径	 	outerdia
 * 卷重	 	stripweight
 * 生产日期	 	producetime
 * 结束日期	 	finishtime
 * 质量标准（国标、行业、厂标）	standard
 *
 */
@Data
public class ProductBasicInformation {

    private	String	coilnoparent	;
    private	String	steelgrade	;
    private	String	coilno	;
    private	Double	stripthick	;
    private	Double	stripwidth	;
    private	Double	stripcrown	;
    private	Double	striplength	;
    private	Double	innerdia	;
    private	Double	outerdia	;
    private	Double	stripweight	;
    private	String	producetime	;
    private	String	finishtime	;
    private	String	standard	;


}
