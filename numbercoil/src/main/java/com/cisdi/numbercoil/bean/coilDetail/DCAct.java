package com.cisdi.numbercoil.bean.coilDetail;

import lombok.Data;

import java.util.ArrayList;

/**
 * 层冷卷取
 * 	冷却区各集管开启状态	cs_coolvalve_status
 * 	侧喷阀门开启状态	cs_sidevalve_status
 * 	故障阀状态	cs_faultvalve_status
 * 	卷取机号	dc_no
 * 	夹送辊张力	dc_pr_tension
 * 	C1上夹送辊速度	dc1_prt_speed
 * 	C1下夹送辊速度	dc1_prb_speed
 * 	C2上夹送辊速度	dc2_prt_speed
 * 	C2下夹送辊速度	dc2_prb_speed
 * 	C3上夹送辊速度	dc3_prt_speed
 * 	C3下夹送辊速度	dc3_prb_speed
 * 	卷筒张力	dc_md_tension
 * 	C1卷筒速度	dc1_md_speed
 * 	C2卷筒速度	dc2_md_speed
 * 	C3卷筒速度	dc3_md_speed
 */
@Data
public class DCAct {
    private ArrayList<Double> cs_coolvalve_status	;
    private	ArrayList<Double>	cs_sidevalve_status	;
    private	ArrayList<Double>	cs_faultvalve_status	;
    private	ArrayList<Double>	dc_no	;
    private	ArrayList<Double>	dc_pr_tension	;
    private	ArrayList<Double>	dc1_prt_speed	;
    private	ArrayList<Double>	dc1_prb_speed	;
    private	ArrayList<Double>	dc2_prt_speed	;
    private	ArrayList<Double>	dc2_prb_speed	;
    private	ArrayList<Double>	dc3_prt_speed	;
    private	ArrayList<Double>	dc3_prb_speed	;
    private	ArrayList<Double>	dc_md_tension	;
    private	ArrayList<Double>	dc1_md_speed	;
    private	ArrayList<Double>	dc2_md_speed	;
    private	ArrayList<Double>	dc3_md_speed	;


}
