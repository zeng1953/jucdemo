package com.cisdi.numbercoil.bean.coilDetail;

import lombok.Data;

/**
 * 钢卷测量数据
 * 	带钢实测厚度	curve_fmthick
 * 	带钢实测宽度	curve_fmwidth
 * 	带钢实测凸度（C10）	curve_crownc10
 * 	带钢实测凸度（C20）	curve_crownc20
 * 	带钢实测凸度（C50）	curve_crownc50
 * 	带钢实测凸度（C100）	curve_crownc100
 * 	带钢实测楔形(C25)	curve_wedgec25
 * 	带钢实测楔形(C100)	curve_wedgec100
 * 	带钢实测终轧温度	curve_fdt
 * 	带钢实测卷取温度	curve_ct
 */

@Data
public class CoilMeasurementData {
    private	Double	curve_fmthick	;
    private	Double	curve_fmwidth	;
    private	Double	curve_crownc10	;
    private	Double	curve_crownc20	;
    private	Double	curve_crownc50	;
    private	Double	curve_crownc100	;
    private	Double	curve_wedgec25	;
    private	Double	curve_wedgec100	;
    private	Double	curve_fdt	;
    private	Double	curve_ct	;


}
