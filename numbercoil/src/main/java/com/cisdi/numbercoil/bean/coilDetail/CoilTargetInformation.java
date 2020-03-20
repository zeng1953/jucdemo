package com.cisdi.numbercoil.bean.coilDetail;

import lombok.Data;

/**
 * 钢卷目标信息
 *
 * 	带钢目标厚度	    fmaimthick
 * 	带钢目标厚度上限	fmaimthickhigh
 * 	带钢目标厚度下限	fmaimthicklow
 * 	带钢目标宽度	    fmaimwidth
 * 	带钢目标宽度上限	fmaimwidthhigh
 * 	带钢目标宽度下限	fmaimwidthlow
 * 	带钢目标凸度	    fmaimcrown
 * 	带钢目标凸度上限	fmaimcrownhigh
 * 	带钢目标凸度下限	fmaimcrownlow
 * 	带钢目标平直度	fmaimflatness
 * 	带钢目标平直度上限	fmaimflatnesshigh
 * 	带钢目标平直度下限	fmaimflatnesslow
 * 	带钢目标终轧温度	    aimfdt
 * 	带钢目标终轧温度上限	aimfdthigh
 * 	带钢目标终轧温度下限	aimfdtlow
 * 	带钢目标卷取温度	    aimct
 * 	带钢目标卷取温上限	aimcthigh
 * 	带钢目标卷取温下限	aimctlow
 */
@Data
public class CoilTargetInformation {
    private	Double	fmaimthick	;
    private	Double	fmaimthickhigh	;
    private	Double	fmaimthicklow	;
    private	Double	fmaimwidth	;
    private	Double	fmaimwidthhigh	;
    private	Double	fmaimwidthlow	;
    private	Double	fmaimcrown	;
    private	Double	fmaimcrownhigh	;
    private	Double	fmaimcrownlow	;
    private	Double	fmaimflatness	;
    private	Double	fmaimflatnesshigh	;
    private	Double	fmaimflatnesslow	;
    private	Double	aimfdt	;
    private	Double	aimfdthigh	;
    private	Double	aimfdtlow	;
    private	Double	aimct	;
    private	Double	aimcthigh	;
    private	Double	aimctlow	;

}
