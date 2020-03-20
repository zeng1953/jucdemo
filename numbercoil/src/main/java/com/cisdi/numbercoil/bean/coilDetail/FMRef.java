package com.cisdi.numbercoil.bean.coilDetail;

import lombok.Data;

import java.util.ArrayList;

/**
 * 精轧
 * 	抛钢减速度	decc
 * 	最大抛钢速度	runoutspeed
 * 	F1厚度控制设定值	F1_agc_wssthc
 * 	F2厚度控制设定值	F2_agc_wssthc
 * 	F3厚度控制设定值	F3_agc_wssthc
 * 	F4厚度控制设定值	F4_agc_wssthc
 * 	F5厚度控制设定值	F5_agc_wssthc
 * 	F6厚度控制设定值	F6_agc_wssthc
 * 	F7厚度控制设定值	F7_agc_wssthc
 * 	F1自动厚度控制设定值	F1_agc_wssagc
 * 	F2自动厚度控制设定值	F2_agc_wssagc
 * 	F3自动厚度控制设定值	F3_agc_wssagc
 * 	F4自动厚度控制设定值	F4_agc_wssagc
 * 	F5自动厚度控制设定值	F5_agc_wssagc
 * 	F6自动厚度控制设定值	F6_agc_wssagc
 * 	F7自动厚度控制设定值	F7_agc_wssagc
 * 	F1机架出口厚度	F1_extthick
 * 	F2机架出口厚度	F2_extthick
 * 	F3机架出口厚度	F3_extthick
 * 	F4机架出口厚度	F4_extthick
 * 	F5机架出口厚度	F5_extthick
 * 	F6机架出口厚度	F6_extthick
 * 	F7机架出口厚度	F7_extthick
 * 	F1设定轧制力	F1_set_force
 * 	F2设定轧制力	F2_set_force
 * 	F3设定轧制力	F3_set_force
 * 	F4设定轧制力	F4_set_force
 * 	F5设定轧制力	F5_set_force
 * 	F6设定轧制力	F6_set_force
 * 	F7设定轧制力	F7_set_force
 * 	F1设定弯辊力	F1_set_bendforce
 * 	F2设定弯辊力	F2_set_bendforce
 * 	F3设定弯辊力	F3_set_bendforce
 * 	F4设定弯辊力	F4_set_bendforce
 * 	F5设定弯辊力	F5_set_bendforce
 * 	F6设定弯辊力	F6_set_bendforce
 * 	F7设定弯辊力	F7_set_bendforce
 * 	F1窜辊设定	F1_set_shift
 * 	F2窜辊设定	F2_set_shift
 * 	F3窜辊设定	F3_set_shift
 * 	F4窜辊设定	F4_set_shift
 * 	F5窜辊设定	F5_set_shift
 * 	F6窜辊设定	F6_set_shift
 * 	F7窜辊设定	F7_set_shift
 * 	F1设定机架工作辊线速度	F1_set_rollspeed
 * 	F2设定机架工作辊线速度	F2_set_rollspeed
 * 	F3设定机架工作辊线速度	F3_set_rollspeed
 * 	F4设定机架工作辊线速度	F4_set_rollspeed
 * 	F5设定机架工作辊线速度	F5_set_rollspeed
 * 	F6设定机架工作辊线速度	F6_set_rollspeed
 * 	F7设定机架工作辊线速度	F7_set_rollspeed
 * 	F1设定机架入口温度	F1_set_enttemp
 * 	F2设定机架入口温度	F2_set_enttemp
 * 	F3设定机架入口温度	F3_set_enttemp
 * 	F4设定机架入口温度	F4_set_enttemp
 * 	F5设定机架入口温度	F5_set_enttemp
 * 	F6设定机架入口温度	F6_set_enttemp
 * 	F7设定机架入口温度	F7_set_enttemp
 * 	F1设定机架出口温度	F1_set_exttemp
 * 	F2设定机架出口温度	F2_set_exttemp
 * 	F3设定机架出口温度	F3_set_exttemp
 * 	F4设定机架出口温度	F4_set_exttemp
 * 	F5设定机架出口温度	F5_set_exttemp
 * 	F6设定机架出口温度	F6_set_exttemp
 * 	F7设定机架出口温度	F7_set_exttemp
 * 	F1机架间设定活套角度	F1_set_looperangle
 * 	F2机架间设定活套角度	F2_set_looperangle
 * 	F3机架间设定活套角度	F3_set_looperangle
 * 	F4机架间设定活套角度	F4_set_looperangle
 * 	F5机架间设定活套角度	F5_set_looperangle
 * 	F6机架间设定活套角度	F6_set_looperangle
 * 	F1活套设定张力	F1_set_loopertension
 * 	F2活套设定张力	F2_set_loopertension
 * 	F3活套设定张力	F3_set_loopertension
 * 	F4活套设定张力	F4_set_loopertension
 * 	F5活套设定张力	F5_set_loopertension
 * 	F6活套设定张力	F6_set_loopertension
 * 	平直度全长最小值	flatall_min
 * 	平直度全长最大值	flatall_max
 * 	对称平直度全长均值	symflatnessMeanALL
 * 	L2_FM_平直度命中率(头部)	L2_FM_FLAT_100_FIRE
 * 	L2_FM_平直度命中率(全长)	L2_FM_WEDEG1_FIRE
 * 	L2_FM_冷后头部100米对称平直度精度（34IU）	L2_FM_IMS_31
 * 	L2_FM_冷后头部100米非对称平直度精度（34IU）	L2_FM_IMS_32
 * 	L2_FM_冷后尾部100米对称平直度精度（34IU）	L2_FM_IMS_33
 * 	L2_FM_冷后尾部100米非对称平直度精度（34IU）	L2_FM_IMS_34
 * 	头部100米对称平直度精度	symflatness_head100
 * 	头部100米非对称平直度精度	asymflatness_head100
 * 	尾部100米对称平直度精度	symflatness_tail100
 * 	尾部100米非对称平直度精度	asymflatness_tail100
 * 	L2_FM_带钢穿带速度	threadspeed
 */

@Data
public class FMRef {
    private	Double	decc	;
    private	Double	runoutspeed	;
    private	ArrayList<Double>	F1_agc_wssthc	;
    private	ArrayList<Double>	F2_agc_wssthc	;
    private	ArrayList<Double>	F3_agc_wssthc	;
    private	ArrayList<Double>	F4_agc_wssthc	;
    private	ArrayList<Double>	F5_agc_wssthc	;
    private	ArrayList<Double>	F6_agc_wssthc	;
    private	ArrayList<Double>	F7_agc_wssthc	;
    private	ArrayList<Double>	F1_agc_wssagc	;
    private	ArrayList<Double>	F2_agc_wssagc	;
    private	ArrayList<Double>	F3_agc_wssagc	;
    private	ArrayList<Double>	F4_agc_wssagc	;
    private	ArrayList<Double>	F5_agc_wssagc	;
    private	ArrayList<Double>	F6_agc_wssagc	;
    private	ArrayList<Double>	F7_agc_wssagc	;
    private	Double	F1_extthick	;
    private	Double	F2_extthick	;
    private	Double	F3_extthick	;
    private	Double	F4_extthick	;
    private	Double	F5_extthick	;
    private	Double	F6_extthick	;
    private	Double	F7_extthick	;
    private	Double	F1_set_force	;
    private	Double	F2_set_force	;
    private	Double	F3_set_force	;
    private	Double	F4_set_force	;
    private	Double	F5_set_force	;
    private	Double	F6_set_force	;
    private	Double	F7_set_force	;
    private	Double	F1_set_bendforce	;
    private	Double	F2_set_bendforce	;
    private	Double	F3_set_bendforce	;
    private	Double	F4_set_bendforce	;
    private	Double	F5_set_bendforce	;
    private	Double	F6_set_bendforce	;
    private	Double	F7_set_bendforce	;
    private	Double	F1_set_shift	;
    private	Double	F2_set_shift	;
    private	Double	F3_set_shift	;
    private	Double	F4_set_shift	;
    private	Double	F5_set_shift	;
    private	Double	F6_set_shift	;
    private	Double	F7_set_shift	;
    private	Double	F1_set_rollspeed	;
    private	Double	F2_set_rollspeed	;
    private	Double	F3_set_rollspeed	;
    private	Double	F4_set_rollspeed	;
    private	Double	F5_set_rollspeed	;
    private	Double	F6_set_rollspeed	;
    private	Double	F7_set_rollspeed	;
    private	Double	F1_set_enttemp	;
    private	Double	F2_set_enttemp	;
    private	Double	F3_set_enttemp	;
    private	Double	F4_set_enttemp	;
    private	Double	F5_set_enttemp	;
    private	Double	F6_set_enttemp	;
    private	Double	F7_set_enttemp	;
    private	Double	F1_set_exttemp	;
    private	Double	F2_set_exttemp	;
    private	Double	F3_set_exttemp	;
    private	Double	F4_set_exttemp	;
    private	Double	F5_set_exttemp	;
    private	Double	F6_set_exttemp	;
    private	Double	F7_set_exttemp	;
    private	ArrayList<Double>	F1_set_looperangle	;
    private	ArrayList<Double>	F2_set_looperangle	;
    private	ArrayList<Double>	F3_set_looperangle	;
    private	ArrayList<Double>	F4_set_looperangle	;
    private	ArrayList<Double>	F5_set_looperangle	;
    private	ArrayList<Double>	F6_set_looperangle	;
    private	ArrayList<Double>	F1_set_loopertension	;
    private	ArrayList<Double>	F2_set_loopertension	;
    private	ArrayList<Double>	F3_set_loopertension	;
    private	ArrayList<Double>	F4_set_loopertension	;
    private	ArrayList<Double>	F5_set_loopertension	;
    private	ArrayList<Double>	F6_set_loopertension	;
    private	Double	flatall_min	;
    private	Double	flatall_max	;
    private	Double	symflatnessMeanALL	;
    private	Double	L2_FM_FLAT_100_FIRE	;
    private	Double	L2_FM_WEDEG1_FIRE	;
    private	Double	L2_FM_IMS_31	;
    private	Double	L2_FM_IMS_32	;
    private	Double	L2_FM_IMS_33	;
    private	Double	L2_FM_IMS_34	;
    private	Double	symflatness_head100	;
    private	Double	asymflatness_head100	;
    private	Double	symflatness_tail100	;
    private	Double	asymflatness_tail100	;
    private	Double	threadspeed	;

}
