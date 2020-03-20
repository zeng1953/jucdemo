package com.cisdi.numbercoil.bean.coilDetail;

import lombok.Data;

import java.util.ArrayList;

/**
 * 粗轧实测值
 * 	粗轧除鳞后温度	rmdesc_temp
 * 	SSP使用标志	ssp_use
 * 	SSP电机实际电流	ssp_act_current
 * 	SSP出口实测热宽度	ssp_act_exitwidth
 * 	粗轧轧制道次1	rm1_pass_total
 * 	粗轧轧制道次2	rm2_pass_total
 * 	粗轧轧制道次3	rm3_pass_total
 * 	粗轧轧制道次4	rm4_pass_total
 * 	粗轧轧制道次5	rm5_pass_total
 * 	粗轧轧制道次6	rm6_pass_total
 * 	粗轧轧制道次7	rm7_pass_total
 * 	粗轧R1每道次实测辊缝值	rmr1_act_rollgap
 * 	粗轧R1每道次实测轧制力	rmr1_act_force
 * 	粗轧R1每道次实际电机功率	rmr1_act_power
 * 	粗轧R1每道次轧机电流	rmr1_act_current
 * 	"粗轧R1每道次工作辊实际
 * 线速度"	rmr1_act_rollspeed
 * 	粗轧R1每道次除鳞标志	rmr1_descflag
 * 	粗轧R11每道次出口温度	rmr11_act_extemp
 * 	粗轧R12每道次出口温度	rmr12_act_extemp
 * 	粗轧R13每道次出口温度	rmr13_act_extemp
 * 	粗轧R14每道次出口温度	rmr14_act_extemp
 * 	粗轧R15每道次出口温度	rmr15_act_extemp
 * 	粗轧R16每道次出口温度	rmr16_act_extemp
 * 	粗轧R17每道次出口温度	rmr17_act_extemp
 * 	粗轧R21每道次实测辊缝值	rmr21_act_rollgap
 * 	粗轧R22每道次实测辊缝值	rmr22_act_rollgap
 * 	粗轧R23每道次实测辊缝值	rmr23_act_rollgap
 * 	粗轧R24每道次实测辊缝值	rmr24_act_rollgap
 * 	粗轧R25每道次实测辊缝值	rmr25_act_rollgap
 * 	粗轧R26每道次实测辊缝值	rmr26_act_rollgap
 * 	粗轧R27每道次实测辊缝值	rmr27_act_rollgap
 * 	粗轧R21每道次实测轧制力	rmr21_act_force
 * 	粗轧R22每道次实测轧制力	rmr22_act_force
 * 	粗轧R23每道次实测轧制力	rmr23_act_force
 * 	粗轧R24每道次实测轧制力	rmr24_act_force
 * 	粗轧R25每道次实测轧制力	rmr25_act_force
 * 	粗轧R26每道次实测轧制力	rmr26_act_force
 * 	粗轧R27每道次实测轧制力	rmr27_act_force
 * 	粗轧R21每道次实测轧制力传动侧	rmr21_act_forceDS
 * 	粗轧R22每道次实测轧制力传动侧	rmr22_act_forceDS
 * 	粗轧R23每道次实测轧制力传动侧	rmr23_act_forceDS
 * 	粗轧R24每道次实测轧制力传动侧	rmr24_act_forceDS
 * 	粗轧R25每道次实测轧制力传动侧	rmr25_act_forceDS
 * 	粗轧R26每道次实测轧制力传动侧	rmr26_act_forceDS
 * 	粗轧R27每道次实测轧制力传动侧	rmr27_act_forceDS
 * 	粗轧R21每道次实测轧制力操作侧	rmr21_act_forceWS
 * 	粗轧R22每道次实测轧制力操作侧	rmr22_act_forceWS
 * 	粗轧R23每道次实测轧制力操作侧	rmr23_act_forceWS
 * 	粗轧R24每道次实测轧制力操作侧	rmr24_act_forceWS
 * 	粗轧R25每道次实测轧制力操作侧	rmr25_act_forceWS
 * 	粗轧R26每道次实测轧制力操作侧	rmr26_act_forceWS
 * 	粗轧R27每道次实测轧制力操作侧	rmr27_act_forceWS
 * 	粗轧R21每道次入口除鳞标志	rmr21_entrydescflag
 * 	粗轧R22每道次入口除鳞标志	rmr22_entrydescflag
 * 	粗轧R23每道次入口除鳞标志	rmr23_entrydescflag
 * 	粗轧R24每道次入口除鳞标志	rmr24_entrydescflag
 * 	粗轧R25每道次入口除鳞标志	rmr25_entrydescflag
 * 	粗轧R26每道次入口除鳞标志	rmr26_entrydescflag
 * 	粗轧R27每道次入口除鳞标志	rmr27_entrydescflag
 * 	粗轧R21每道次出口除鳞标志	rmr21_exitdescflag
 * 	粗轧R22每道次出口除鳞标志	rmr22_exitdescflag
 * 	粗轧R23每道次出口除鳞标志	rmr23_exitdescflag
 * 	粗轧R24每道次出口除鳞标志	rmr24_exitdescflag
 * 	粗轧R25每道次出口除鳞标志	rmr25_exitdescflag
 * 	粗轧R26每道次出口除鳞标志	rmr26_exitdescflag
 * 	粗轧R27每道次出口除鳞标志	rmr27_exitdescflag
 * 	粗轧R21每道次入口温度	rmr21_act_entemp
 * 	粗轧R22每道次入口温度	rmr22_act_entemp
 * 	粗轧R23每道次入口温度	rmr23_act_entemp
 * 	粗轧R24每道次入口温度	rmr24_act_entemp
 * 	粗轧R25每道次入口温度	rmr25_act_entemp
 * 	粗轧R26每道次入口温度	rmr26_act_entemp
 * 	粗轧R27每道次入口温度	rmr27_act_entemp
 * 	粗轧R21每道次出口温度-1	rmr21_act_extemp_1
 * 	粗轧R22每道次出口温度-1	rmr22_act_extemp_1
 * 	粗轧R23每道次出口温度-1	rmr23_act_extemp_1
 * 	粗轧R24每道次出口温度-1	rmr24_act_extemp_1
 * 	粗轧R25每道次出口温度-1	rmr25_act_extemp_1
 * 	粗轧R26每道次出口温度-1	rmr26_act_extemp_1
 * 	粗轧R27每道次出口温度-1	rmr27_act_extemp_1
 * 	粗轧R21每道次出口温度-2	rmr21_act_extemp_2
 * 	粗轧R22每道次出口温度-2	rmr22_act_extemp_2
 * 	粗轧R23每道次出口温度-2	rmr23_act_extemp_2
 * 	粗轧R24每道次出口温度-2	rmr24_act_extemp_2
 * 	粗轧R25每道次出口温度-2	rmr25_act_extemp_2
 * 	粗轧R26每道次出口温度-2	rmr26_act_extemp_2
 * 	粗轧R27每道次出口温度-2	rmr27_act_extemp_2
 * 	粗轧E21每道次工作辊传动侧实际转速	rme21_act_rollspeedDS
 * 	粗轧E22每道次工作辊传动侧实际转速	rme22_act_rollspeedDS
 * 	粗轧E23每道次工作辊传动侧实际转速	rme23_act_rollspeedDS
 * 	粗轧E24每道次工作辊传动侧实际转速	rme24_act_rollspeedDS
 * 	粗轧E25每道次工作辊传动侧实际转速	rme25_act_rollspeedDS
 * 	粗轧E26每道次工作辊传动侧实际转速	rme26_act_rollspeedDS
 * 	粗轧E27每道次工作辊传动侧实际转速	rme27_act_rollspeedDS
 * 	粗轧E21每道次工作辊操作侧实际转速	rme21_act_rollspeedOS
 * 	粗轧E22每道次工作辊操作侧实际转速	rme22_act_rollspeedOS
 * 	粗轧E23每道次工作辊操作侧实际转速	rme23_act_rollspeedOS
 * 	粗轧E24每道次工作辊操作侧实际转速	rme24_act_rollspeedOS
 * 	粗轧E25每道次工作辊操作侧实际转速	rme25_act_rollspeedOS
 * 	粗轧E26每道次工作辊操作侧实际转速	rme26_act_rollspeedOS
 * 	粗轧E27每道次工作辊操作侧实际转速	rme27_act_rollspeedOS
 * 	粗轧E21每道次实测辊缝值	rme21_act_rollgap
 * 	粗轧E22每道次实测辊缝值	rme22_act_rollgap
 * 	粗轧E23每道次实测辊缝值	rme23_act_rollgap
 * 	粗轧E24每道次实测辊缝值	rme24_act_rollgap
 * 	粗轧E25每道次实测辊缝值	rme25_act_rollgap
 * 	粗轧E26每道次实测辊缝值	rme26_act_rollgap
 * 	粗轧E27每道次实测辊缝值	rme27_act_rollgap
 * 	粗轧E21每道次压头传动侧实测轧制力	rme21_act_forceDS
 * 	粗轧E22每道次压头传动侧实测轧制力	rme22_act_forceDS
 * 	粗轧E23每道次压头传动侧实测轧制力	rme23_act_forceDS
 * 	粗轧E24每道次压头传动侧实测轧制力	rme24_act_forceDS
 * 	粗轧E25每道次压头传动侧实测轧制力	rme25_act_forceDS
 * 	粗轧E26每道次压头传动侧实测轧制力	rme26_act_forceDS
 * 	粗轧E27每道次压头传动侧实测轧制力	rme27_act_forceDS
 * 	粗轧E21每道次压头操作侧实测轧制力	rme21_act_forceOS
 * 	粗轧E22每道次压头操作侧实测轧制力	rme22_act_forceOS
 * 	粗轧E23每道次压头操作侧实测轧制力	rme23_act_forceOS
 * 	粗轧E24每道次压头操作侧实测轧制力	rme24_act_forceOS
 * 	粗轧E25每道次压头操作侧实测轧制力	rme25_act_forceOS
 * 	粗轧E26每道次压头操作侧实测轧制力	rme26_act_forceOS
 * 	粗轧E27每道次压头操作侧实测轧制力	rme27_act_forceOS
 * 	粗轧E21每道次电机电流传动侧	rme21_act_currentDS
 * 	粗轧E22每道次电机电流传动侧	rme22_act_currentDS
 * 	粗轧E23每道次电机电流传动侧	rme23_act_currentDS
 * 	粗轧E24每道次电机电流传动侧	rme24_act_currentDS
 * 	粗轧E25每道次电机电流传动侧	rme25_act_currentDS
 * 	粗轧E26每道次电机电流传动侧	rme26_act_currentDS
 * 	粗轧E27每道次电机电流传动侧	rme27_act_currentDS
 * 	粗轧E21每道次电机电流操作侧	rme21_act_currentOS
 * 	粗轧E22每道次电机电流操作侧	rme22_act_currentOS
 * 	粗轧E23每道次电机电流操作侧	rme23_act_currentOS
 * 	粗轧E24每道次电机电流操作侧	rme24_act_currentOS
 * 	粗轧E25每道次电机电流操作侧	rme25_act_currentOS
 * 	粗轧E26每道次电机电流操作侧	rme26_act_currentOS
 * 	粗轧E27每道次电机电流操作侧	rme27_act_currentOS
 * 	E2操作侧轧制力	E2_loadcell_OS_rollforce
 * 	E2传动侧轧制力	E2_loadcell_DS_rollforce
 * 	中间坯实测宽度	trbwidth
 * 	中间坯厚度下限值	mid_slab_thick_min
 * 	中间坯厚度上限值	mid_slab_thick_max
 * 	中间坯实测中心线偏差	trbcenterDev
 */

@Data
public class RMAct {
    private	ArrayList<Double>	rmdesc_temp	;
    private	ArrayList<Double>	ssp_use	;
    private	ArrayList<Double>	ssp_act_current	;
    private	ArrayList<Double>	ssp_act_exitwidth	;
    private	ArrayList<Double>	rm1_pass_total	;
    private	ArrayList<Double>	rm2_pass_total	;
    private	ArrayList<Double>	rm3_pass_total	;
    private	ArrayList<Double>	rm4_pass_total	;
    private	ArrayList<Double>	rm5_pass_total	;
    private	ArrayList<Double>	rm6_pass_total	;
    private	ArrayList<Double>	rm7_pass_total	;
    private	ArrayList<Double>	rmr1_act_rollgap	;
    private	ArrayList<Double>	rmr1_act_force	;
    private	ArrayList<Double>	rmr1_act_power	;
    private	ArrayList<Double>	rmr1_act_current	;
    private	ArrayList<Double>	rmr1_act_rollspeed	;
    private	ArrayList<Double>	rmr1_descflag	;
    private	ArrayList<Double>	rmr11_act_extemp	;
    private	ArrayList<Double>	rmr12_act_extemp	;
    private	ArrayList<Double>	rmr13_act_extemp	;
    private	ArrayList<Double>	rmr14_act_extemp	;
    private	ArrayList<Double>	rmr15_act_extemp	;
    private	ArrayList<Double>	rmr16_act_extemp	;
    private	ArrayList<Double>	rmr17_act_extemp	;
    private	ArrayList<Double>	rmr21_act_rollgap	;
    private	ArrayList<Double>	rmr22_act_rollgap	;
    private	ArrayList<Double>	rmr23_act_rollgap	;
    private	ArrayList<Double>	rmr24_act_rollgap	;
    private	ArrayList<Double>	rmr25_act_rollgap	;
    private	ArrayList<Double>	rmr26_act_rollgap	;
    private	ArrayList<Double>	rmr27_act_rollgap	;
    private	ArrayList<Double>	rmr21_act_force	;
    private	ArrayList<Double>	rmr22_act_force	;
    private	ArrayList<Double>	rmr23_act_force	;
    private	ArrayList<Double>	rmr24_act_force	;
    private	ArrayList<Double>	rmr25_act_force	;
    private	ArrayList<Double>	rmr26_act_force	;
    private	ArrayList<Double>	rmr27_act_force	;
    private	ArrayList<Double>	rmr21_act_forceDS	;
    private	ArrayList<Double>	rmr22_act_forceDS	;
    private	ArrayList<Double>	rmr23_act_forceDS	;
    private	ArrayList<Double>	rmr24_act_forceDS	;
    private	ArrayList<Double>	rmr25_act_forceDS	;
    private	ArrayList<Double>	rmr26_act_forceDS	;
    private	ArrayList<Double>	rmr27_act_forceDS	;
    private	ArrayList<Double>	rmr21_act_forceWS	;
    private	ArrayList<Double>	rmr22_act_forceWS	;
    private	ArrayList<Double>	rmr23_act_forceWS	;
    private	ArrayList<Double>	rmr24_act_forceWS	;
    private	ArrayList<Double>	rmr25_act_forceWS	;
    private	ArrayList<Double>	rmr26_act_forceWS	;
    private	ArrayList<Double>	rmr27_act_forceWS	;
    private	ArrayList<Double>	rmr21_entrydescflag	;
    private	ArrayList<Double>	rmr22_entrydescflag	;
    private	ArrayList<Double>	rmr23_entrydescflag	;
    private	ArrayList<Double>	rmr24_entrydescflag	;
    private	ArrayList<Double>	rmr25_entrydescflag	;
    private	ArrayList<Double>	rmr26_entrydescflag	;
    private	ArrayList<Double>	rmr27_entrydescflag	;
    private	ArrayList<Double>	rmr21_exitdescflag	;
    private	ArrayList<Double>	rmr22_exitdescflag	;
    private	ArrayList<Double>	rmr23_exitdescflag	;
    private	ArrayList<Double>	rmr24_exitdescflag	;
    private	ArrayList<Double>	rmr25_exitdescflag	;
    private	ArrayList<Double>	rmr26_exitdescflag	;
    private	ArrayList<Double>	rmr27_exitdescflag	;
    private	ArrayList<Double>	rmr21_act_entemp	;
    private	ArrayList<Double>	rmr22_act_entemp	;
    private	ArrayList<Double>	rmr23_act_entemp	;
    private	ArrayList<Double>	rmr24_act_entemp	;
    private	ArrayList<Double>	rmr25_act_entemp	;
    private	ArrayList<Double>	rmr26_act_entemp	;
    private	ArrayList<Double>	rmr27_act_entemp	;
    private	ArrayList<Double>	rmr21_act_extemp_1	;
    private	ArrayList<Double>	rmr22_act_extemp_1	;
    private	ArrayList<Double>	rmr23_act_extemp_1	;
    private	ArrayList<Double>	rmr24_act_extemp_1	;
    private	ArrayList<Double>	rmr25_act_extemp_1	;
    private	ArrayList<Double>	rmr26_act_extemp_1	;
    private	ArrayList<Double>	rmr27_act_extemp_1	;
    private	ArrayList<Double>	rmr21_act_extemp_2	;
    private	ArrayList<Double>	rmr22_act_extemp_2	;
    private	ArrayList<Double>	rmr23_act_extemp_2	;
    private	ArrayList<Double>	rmr24_act_extemp_2	;
    private	ArrayList<Double>	rmr25_act_extemp_2	;
    private	ArrayList<Double>	rmr26_act_extemp_2	;
    private	ArrayList<Double>	rmr27_act_extemp_2	;
    private	ArrayList<Double>	rme21_act_rollspeedDS	;
    private	ArrayList<Double>	rme22_act_rollspeedDS	;
    private	ArrayList<Double>	rme23_act_rollspeedDS	;
    private	ArrayList<Double>	rme24_act_rollspeedDS	;
    private	ArrayList<Double>	rme25_act_rollspeedDS	;
    private	ArrayList<Double>	rme26_act_rollspeedDS	;
    private	ArrayList<Double>	rme27_act_rollspeedDS	;
    private	ArrayList<Double>	rme21_act_rollspeedOS	;
    private	ArrayList<Double>	rme22_act_rollspeedOS	;
    private	ArrayList<Double>	rme23_act_rollspeedOS	;
    private	ArrayList<Double>	rme24_act_rollspeedOS	;
    private	ArrayList<Double>	rme25_act_rollspeedOS	;
    private	ArrayList<Double>	rme26_act_rollspeedOS	;
    private	ArrayList<Double>	rme27_act_rollspeedOS	;
    private	ArrayList<Double>	rme21_act_rollgap	;
    private	ArrayList<Double>	rme22_act_rollgap	;
    private	ArrayList<Double>	rme23_act_rollgap	;
    private	ArrayList<Double>	rme24_act_rollgap	;
    private	ArrayList<Double>	rme25_act_rollgap	;
    private	ArrayList<Double>	rme26_act_rollgap	;
    private	ArrayList<Double>	rme27_act_rollgap	;
    private	ArrayList<Double>	rme21_act_forceDS	;
    private	ArrayList<Double>	rme22_act_forceDS	;
    private	ArrayList<Double>	rme23_act_forceDS	;
    private	ArrayList<Double>	rme24_act_forceDS	;
    private	ArrayList<Double>	rme25_act_forceDS	;
    private	ArrayList<Double>	rme26_act_forceDS	;
    private	ArrayList<Double>	rme27_act_forceDS	;
    private	ArrayList<Double>	rme21_act_forceOS	;
    private	ArrayList<Double>	rme22_act_forceOS	;
    private	ArrayList<Double>	rme23_act_forceOS	;
    private	ArrayList<Double>	rme24_act_forceOS	;
    private	ArrayList<Double>	rme25_act_forceOS	;
    private	ArrayList<Double>	rme26_act_forceOS	;
    private ArrayList<Double> rme27_act_forceOS	;
    private	ArrayList<Double>	rme21_act_currentDS	;
    private	ArrayList<Double>	rme22_act_currentDS	;
    private	ArrayList<Double>	rme23_act_currentDS	;
    private	ArrayList<Double>	rme24_act_currentDS	;
    private	ArrayList<Double>	rme25_act_currentDS	;
    private	ArrayList<Double>	rme26_act_currentDS	;
    private	ArrayList<Double>	rme27_act_currentDS	;
    private	ArrayList<Double>	rme21_act_currentOS	;
    private	ArrayList<Double>	rme22_act_currentOS	;
    private	ArrayList<Double>	rme23_act_currentOS	;
    private	ArrayList<Double>	rme24_act_currentOS	;
    private	ArrayList<Double>	rme25_act_currentOS	;
    private	ArrayList<Double>	rme26_act_currentOS	;
    private	ArrayList<Double>	rme27_act_currentOS	;
    private	Double	E2_loadcell_OS_rollforce	;
    private	Double	E2_loadcell_DS_rollforce	;
    private	ArrayList<Double>	trbwidth	;
    private	Double	mid_slab_thick_min	;
    private	Double	mid_slab_thick_max	;
    private	ArrayList<Double>	trbcenterDev	;


}
