package com.cisdi.numbercoil.bean.coilDetail;

import lombok.Data;

import java.util.ArrayList;

/**
 * 精轧實測值
 * 	精轧除鳞使用标志	fm_descflag
 * 	飞剪高温计实测温度	fmentertemp
 * 	F1使用状态	f1_dummy
 * 	F2使用状态	f2_dummy
 * 	F3使用状态	f3_dummy
 * 	F4使用状态	f4_dummy
 * 	F5使用状态	f5_dummy
 * 	F6使用状态	f6_dummy
 * 	F7使用状态	f7_dummy
 * 	F1辊缝值	f1_act_rollgap
 * 	F2辊缝值	f2_act_rollgap
 * 	F3辊缝值	f3_act_rollgap
 * 	F4辊缝值	f4_act_rollgap
 * 	F5辊缝值	f5_act_rollgap
 * 	F6辊缝值	f6_act_rollgap
 * 	F7辊缝值	f7_act_rollgap
 * 	F1实际辊缝值传动侧	f1_act_rollgapDS
 * 	F2实际辊缝值传动侧	f2_act_rollgapDS
 * 	F3实际辊缝值传动侧	f3_act_rollgapDS
 * 	F4实际辊缝值传动侧	f4_act_rollgapDS
 * 	F5实际辊缝值传动侧	f5_act_rollgapDS
 * 	F6实际辊缝值传动侧	f6_act_rollgapDS
 * 	F7实际辊缝值传动侧	f7_act_rollgapDS
 * 	F1实际辊缝值操作侧	f1_act_rollgapWS
 * 	F2实际辊缝值操作侧	f2_act_rollgapWS
 * 	F3实际辊缝值操作侧	f3_act_rollgapWS
 * 	F4实际辊缝值操作侧	f4_act_rollgapWS
 * 	F5实际辊缝值操作侧	f5_act_rollgapWS
 * 	F6实际辊缝值操作侧	f6_act_rollgapWS
 * 	F7实际辊缝值操作侧	f7_act_rollgapWS
 * 	F1工作辊实际线速度	f1_act_rollspeed
 * 	F2工作辊实际线速度	f2_act_rollspeed
 * 	F3工作辊实际线速度	f3_act_rollspeed
 * 	F4工作辊实际线速度	f4_act_rollspeed
 * 	F5工作辊实际线速度	f5_act_rollspeed
 * 	F6工作辊实际线速度	f6_act_rollspeed
 * 	F7工作辊实际线速度	f7_act_rollspeed
 * 	F1传动侧轧制力	f1_act_forceDS
 * 	F2传动侧轧制力	f2_act_forceDS
 * 	F3传动侧轧制力	f3_act_forceDS
 * 	F4传动侧轧制力	f4_act_forceDS
 * 	F5传动侧轧制力	f5_act_forceDS
 * 	F6传动侧轧制力	f6_act_forceDS
 * 	F7传动侧轧制力	f7_act_forceDS
 * 	F1操作侧轧制力	f1_act_forceWS
 * 	F2操作侧轧制力	f2_act_forceWS
 * 	F3操作侧轧制力	f3_act_forceWS
 * 	F4操作侧轧制力	f4_act_forceWS
 * 	F5操作侧轧制力	f5_act_forceWS
 * 	F6操作侧轧制力	f6_act_forceWS
 * 	F7操作侧轧制力	f7_act_forceWS
 * 	F1实际弯辊力	f1_act_bendforce
 * 	F2实际弯辊力	f2_act_bendforce
 * 	F3实际弯辊力	f3_act_bendforce
 * 	F4实际弯辊力	f4_act_bendforce
 * 	F5实际弯辊力	f5_act_bendforce
 * 	F6实际弯辊力	f6_act_bendforce
 * 	F7实际弯辊力	f7_act_bendforce
 * 	F1实际窜辊位置	f1_act_shiftpos
 * 	F2实际窜辊位置	f2_act_shiftpos
 * 	F3实际窜辊位置	f3_act_shiftpos
 * 	F5实际窜辊位置	f5_act_shiftpos
 * 	F6实际窜辊位置	f6_act_shiftpos
 * 	F1电机电流	f1_act_current
 * 	F2电机电流	f2_act_current
 * 	F3电机电流	f3_act_current
 * 	F4电机电流	f4_act_current
 * 	F5电机电流	f5_act_current
 * 	F6电机电流	f6_act_current
 * 	F7电机电流	f7_act_current
 * 	F1活套角度	f1_act_loopergangle
 * 	F2活套角度	f2_act_loopergangle
 * 	F3活套角度	f3_act_loopergangle
 * 	F4活套角度	f4_act_loopergangle
 * 	F5活套角度	f5_act_loopergangle
 * 	F6活套角度	f6_act_loopergangle
 * 	F1活套张力	f1_act_tension
 * 	F2活套张力	f2_act_tension
 * 	F3活套张力	f3_act_tension
 * 	F4活套张力	f4_act_tension
 * 	F5活套张力	f5_act_tension
 * 	F6活套张力	f6_act_tension
 * 	F1轧机转矩	f1_torque
 * 	F2轧机转矩	f2_torque
 * 	F3轧机转矩	f3_torque
 * 	F4轧机转矩	f4_torque
 * 	F5轧机转矩	f5_torque
 * 	F6轧机转矩	f6_torque
 * 	F7轧机转矩	f7_torque
 * 	F1的咬钢信号	f1_SIS
 * 	F2的咬钢信号	f2_SIS
 * 	F3的咬钢信号	f3_SIS
 * 	F4的咬钢信号	f4_SIS
 * 	F5的咬钢信号	f5_SIS
 * 	F6的咬钢信号	f6_SIS
 * 	F7的咬钢信号	f7_SIS
 * 	F1精轧机架间传动侧侧导板位置	f1_act_possideguideDS
 * 	F2精轧机架间传动侧侧导板位置	f2_act_possideguideDS
 * 	F3精轧机架间传动侧侧导板位置	f3_act_possideguideDS
 * 	F4精轧机架间传动侧侧导板位置	f4_act_possideguideDS
 * 	F5精轧机架间传动侧侧导板位置	f5_act_possideguideDS
 * 	F6精轧机架间传动侧侧导板位置	f6_act_possideguideDS
 * 	F7精轧机架间传动侧侧导板位置	f7_act_possideguideDS
 * 	F1精轧机架间操作侧侧导板位置	f1_act_possideguideOS
 * 	F2精轧机架间操作侧侧导板位置	f2_act_possideguideOS
 * 	F3精轧机架间操作侧侧导板位置	f3_act_possideguideOS
 * 	F4精轧机架间操作侧侧导板位置	f4_act_possideguideOS
 * 	F5精轧机架间操作侧侧导板位置	f5_act_possideguideOS
 * 	F6精轧机架间操作侧侧导板位置	f6_act_possideguideOS
 * 	F7精轧机架间操作侧侧导板位置	f7_act_possideguideOS
 * 	F2精轧机架间上冷却水流量	f2_intercool_topflow
 * 	F3精轧机架间上冷却水流量	f3_intercool_topflow
 * 	F4精轧机架间上冷却水流量	f4_intercool_topflow
 * 	F5精轧机架间上冷却水流量	f5_intercool_topflow
 * 	F6精轧机架间上冷却水流量	f6_intercool_topflow
 * 	F2精轧机架间下冷却水流量	f2_intercool_botflow
 * 	F3精轧机架间下冷却水流量	f3_intercool_botflow
 * 	F4精轧机架间下冷却水流量	f4_intercool_botflow
 * 	F5精轧机架间下冷却水流量	f5_intercool_botflow
 * 	F6精轧机架间下冷却水流量	f6_intercool_botflow
 * 	F1精轧机工作辊冷却水流量	f1_rollcoolflow
 * 	F2精轧机工作辊冷却水流量	f2_rollcoolflow
 * 	F3精轧机工作辊冷却水流量	f3_rollcoolflow
 * 	F4精轧机工作辊冷却水流量	f4_rollcoolflow
 * 	F5精轧机工作辊冷却水流量	f5_rollcoolflow
 * 	F6精轧机工作辊冷却水流量	f6_rollcoolflow
 * 	F7精轧机工作辊冷却水流量	f7_rollcoolflow
 */
@Data
public class FMAct {
    private	ArrayList<Double>	fm_descflag	;
    private	ArrayList<Double>	fmentertemp	;
    private	ArrayList<Double>	f1_dummy	;
    private	ArrayList<Double>	f2_dummy	;
    private	ArrayList<Double>	f3_dummy	;
    private	ArrayList<Double>	f4_dummy	;
    private	ArrayList<Double>	f5_dummy	;
    private	ArrayList<Double>	f6_dummy	;
    private	ArrayList<Double>	f7_dummy	;
    private	ArrayList<Double>	f1_act_rollgap	;
    private	ArrayList<Double>	f2_act_rollgap	;
    private	ArrayList<Double>	f3_act_rollgap	;
    private	ArrayList<Double>	f4_act_rollgap	;
    private	ArrayList<Double>	f5_act_rollgap	;
    private	ArrayList<Double>	f6_act_rollgap	;
    private	ArrayList<Double>	f7_act_rollgap	;
    private	ArrayList<Double>	f1_act_rollgapDS	;
    private	ArrayList<Double>	f2_act_rollgapDS	;
    private	ArrayList<Double>	f3_act_rollgapDS	;
    private	ArrayList<Double>	f4_act_rollgapDS	;
    private	ArrayList<Double>	f5_act_rollgapDS	;
    private	ArrayList<Double>	f6_act_rollgapDS	;
    private	ArrayList<Double>	f7_act_rollgapDS	;
    private	ArrayList<Double>	f1_act_rollgapWS	;
    private	ArrayList<Double>	f2_act_rollgapWS	;
    private	ArrayList<Double>	f3_act_rollgapWS	;
    private	ArrayList<Double>	f4_act_rollgapWS	;
    private	ArrayList<Double>	f5_act_rollgapWS	;
    private	ArrayList<Double>	f6_act_rollgapWS	;
    private	ArrayList<Double>	f7_act_rollgapWS	;
    private	ArrayList<Double>	f1_act_rollspeed	;
    private	ArrayList<Double>	f2_act_rollspeed	;
    private	ArrayList<Double>	f3_act_rollspeed	;
    private	ArrayList<Double>	f4_act_rollspeed	;
    private	ArrayList<Double>	f5_act_rollspeed	;
    private	ArrayList<Double>	f6_act_rollspeed	;
    private	ArrayList<Double>	f7_act_rollspeed	;
    private	ArrayList<Double>	f1_act_forceDS	;
    private	ArrayList<Double>	f2_act_forceDS	;
    private	ArrayList<Double>	f3_act_forceDS	;
    private	ArrayList<Double>	f4_act_forceDS	;
    private	ArrayList<Double>	f5_act_forceDS	;
    private	ArrayList<Double>	f6_act_forceDS	;
    private	ArrayList<Double>	f7_act_forceDS	;
    private	ArrayList<Double>	f1_act_forceWS	;
    private	ArrayList<Double>	f2_act_forceWS	;
    private	ArrayList<Double>	f3_act_forceWS	;
    private	ArrayList<Double>	f4_act_forceWS	;
    private	ArrayList<Double>	f5_act_forceWS	;
    private	ArrayList<Double>	f6_act_forceWS	;
    private	ArrayList<Double>	f7_act_forceWS	;
    private	ArrayList<Double>	f1_act_bendforce	;
    private	ArrayList<Double>	f2_act_bendforce	;
    private	ArrayList<Double>	f3_act_bendforce	;
    private	ArrayList<Double>	f4_act_bendforce	;
    private	ArrayList<Double>	f5_act_bendforce	;
    private	ArrayList<Double>	f6_act_bendforce	;
    private	ArrayList<Double>	f7_act_bendforce	;
    private	ArrayList<Double>	f1_act_shiftpos	;
    private	ArrayList<Double>	f2_act_shiftpos	;
    private	ArrayList<Double>	f3_act_shiftpos	;
    private	ArrayList<Double>	f5_act_shiftpos	;
    private	ArrayList<Double>	f6_act_shiftpos	;
    private	ArrayList<Double>	f1_act_current	;
    private	ArrayList<Double>	f2_act_current	;
    private	ArrayList<Double>	f3_act_current	;
    private	ArrayList<Double>	f4_act_current	;
    private	ArrayList<Double>	f5_act_current	;
    private	ArrayList<Double>	f6_act_current	;
    private	ArrayList<Double>	f7_act_current	;
    private	ArrayList<Double>	f1_act_loopergangle	;
    private	ArrayList<Double>	f2_act_loopergangle	;
    private	ArrayList<Double>	f3_act_loopergangle	;
    private	ArrayList<Double>	f4_act_loopergangle	;
    private	ArrayList<Double>	f5_act_loopergangle	;
    private	ArrayList<Double>	f6_act_loopergangle	;
    private	ArrayList<Double>	f1_act_tension	;
    private	ArrayList<Double>	f2_act_tension	;
    private	ArrayList<Double>	f3_act_tension	;
    private	ArrayList<Double>	f4_act_tension	;
    private	ArrayList<Double>	f5_act_tension	;
    private	ArrayList<Double>	f6_act_tension	;
    private	ArrayList<Double>	f1_torque	;
    private	ArrayList<Double>	f2_torque	;
    private	ArrayList<Double>	f3_torque	;
    private	ArrayList<Double>	f4_torque	;
    private	ArrayList<Double>	f5_torque	;
    private	ArrayList<Double>	f6_torque	;
    private	ArrayList<Double>	f7_torque	;
    private	ArrayList<Double>	f1_SIS	;
    private	ArrayList<Double>	f2_SIS	;
    private	ArrayList<Double>	f3_SIS	;
    private	ArrayList<Double>	f4_SIS	;
    private	ArrayList<Double>	f5_SIS	;
    private	ArrayList<Double>	f6_SIS	;
    private	ArrayList<Double>	f7_SIS	;
    private	ArrayList<Double>	f1_act_possideguideDS	;
    private	ArrayList<Double>	f2_act_possideguideDS	;
    private	ArrayList<Double>	f3_act_possideguideDS	;
    private	ArrayList<Double>	f4_act_possideguideDS	;
    private	ArrayList<Double>	f5_act_possideguideDS	;
    private	ArrayList<Double>	f6_act_possideguideDS	;
    private	ArrayList<Double>	f7_act_possideguideDS	;
    private	ArrayList<Double>	f1_act_possideguideOS	;
    private	ArrayList<Double>	f2_act_possideguideOS	;
    private	ArrayList<Double>	f3_act_possideguideOS	;
    private ArrayList<Double> f4_act_possideguideOS	;
    private	ArrayList<Double>	f5_act_possideguideOS	;
    private	ArrayList<Double>	f6_act_possideguideOS	;
    private	ArrayList<Double>	f7_act_possideguideOS	;
    private	ArrayList<Double>	f2_intercool_topflow	;
    private	ArrayList<Double>	f3_intercool_topflow	;
    private	ArrayList<Double>	f4_intercool_topflow	;
    private	ArrayList<Double>	f5_intercool_topflow	;
    private	ArrayList<Double>	f6_intercool_topflow	;
    private	ArrayList<Double>	f2_intercool_botflow	;
    private	ArrayList<Double>	f3_intercool_botflow	;
    private	ArrayList<Double>	f4_intercool_botflow	;
    private	ArrayList<Double>	f5_intercool_botflow	;
    private	ArrayList<Double>	f6_intercool_botflow	;
    private	ArrayList<Double>	f1_rollcoolflow	;
    private	ArrayList<Double>	f2_rollcoolflow	;
    private	ArrayList<Double>	f3_rollcoolflow	;
    private	ArrayList<Double>	f4_rollcoolflow	;
    private	ArrayList<Double>	f5_rollcoolflow	;
    private	ArrayList<Double>	f6_rollcoolflow	;
    private	ArrayList<Double>	f7_rollcoolflow	;

}
