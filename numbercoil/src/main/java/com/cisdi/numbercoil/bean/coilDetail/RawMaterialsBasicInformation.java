package com.cisdi.numbercoil.bean.coilDetail;


import lombok.Data;

/**
 * 原料基本信息
 * 板坯厚度	 	slabthick
 * 额定板坯厚度	 thi_slab_thick
 * 板坯宽度	 	slabwidth
 * 板坯头部宽度	 slabwidthhead
 * 板坯尾部宽度	 slabwidthtail
 * 板坯长度	 	slablength
 * 板坯重量	 	slabweight
 * 是否混交坯（炉次降级）	 isdegradation
 */
@Data
public class RawMaterialsBasicInformation {
    private	Double	slabthick	;
    private	Double	thi_slab_thick	;
    private	Double	slabwidth	;
    private	Double	slabwidthhead	;
    private	Double	slabwidthtail	;
    private	Double	slablength	;
    private	Double	slabweight	;
    private	String	isdegradation	;

}
