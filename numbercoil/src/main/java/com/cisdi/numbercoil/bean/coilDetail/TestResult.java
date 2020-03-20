package com.cisdi.numbercoil.bean.coilDetail;

import lombok.Data;

/**
 * 检化验结果
 * 	屈服上限	yield_strength_max
 * 	屈服下限	yield_strength_min
 * 	抗拉上限	tensile_strength_max
 * 	抗拉下限	tensile_strength_min
 * 	延伸率	elongation
 * 	断裂延伸率上限	break_el_max
 * 	断裂延伸率目标	break_el_aim
 * 	断裂延伸率下限	break_el_min
 * 	冲击功均值下限	impact_aver_min
 * 	冲击功单值下限	impact_val_min
 * 	硬度	hardness
 * 	下屈服强度_1	bot_ys_1
 * 	上屈服强度_1	top_ys_1
 * 	延伸强度_1	yield_rt_1
 * 	抗拉强度1	ts_1
 * 	伸长率1	el_1
 * 	断面收缩率	redu_area
 * 	均匀延伸率	homo_el
 * 	下屈服强度_2	bot_ys_2
 * 	上屈服强度_2	top_ys_2
 * 	延伸强度_2	yield_rt_1
 * 	抗拉强度2	ts_2
 * 	伸长率2	el_2
 * 	下屈服强度_3	bot_ys_3
 * 	上屈服强度_3	top_ys_3
 * 	延伸强度_3	yield_rt_1
 * 	抗拉强度3	ts_3
 * 	伸长率3	el_3
 * 	磁感度	magnetic
 */
@Data
public class TestResult {
    private	Double	yield_strength_max	;
    private	Double	yield_strength_min	;
    private	Double	tensile_strength_max	;
    private	Double	tensile_strength_min	;
    private	Double	elongation	;
    private	Double	break_el_max	;
    private	Double	break_el_aim	;
    private	Double	break_el_min	;
    private	Double	impact_aver_min	;
    private	Double	impact_val_min	;
    private	Double	hardness	;
    private	Double	bot_ys_1	;
    private	Double	top_ys_1	;
    private	Double	yield_rt_1	;
    private	Double	ts_1	;
    private	Double	el_1	;
    private	Double	redu_area	;
    private	Double	homo_el	;
    private	Double	bot_ys_2	;
    private	Double	top_ys_2	;
//    private	Double	yield_rt_1	;
    private	Double	ts_2	;
    private	Double	el_2	;
    private	Double	bot_ys_3	;
    private	Double	top_ys_3	;
//    private	Double	yield_rt_1	;
    private	Double	ts_3	;
    private	Double	el_3	;
    private	Double	magnetic	;


}
