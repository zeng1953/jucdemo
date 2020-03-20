package com.cisdi.numbercoil.bean.coilDetail;

import lombok.Data;

import java.util.ArrayList;

/**
 * 层冷及卷取
 * 	C1卷筒张力给定	C1_ma_tension_ref
 * 	C3卷筒张力给定	C3_ma_tension_ref
 */
@Data
public class DCRef {
    private String      my_type_string;//測試
    private ArrayList<Double> C1_ma_tension_ref	;
    private	ArrayList<Double>	C3_ma_tension_ref	;
}
