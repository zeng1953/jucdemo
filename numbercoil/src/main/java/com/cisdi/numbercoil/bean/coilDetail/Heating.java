package com.cisdi.numbercoil.bean.coilDetail;

import lombok.Data;

/**
 * 加热信息
 * 	入炉温度	fur_chargetemp
 * 	装炉时刻	fur_chargetime
 * 	出炉时刻	fur_extracttime
 * 	在炉时间	fur_intime
 * 	在预热段时间	fur_intime_preheat
 * 	在一加段时间	fur_intime_heat1
 * 	在二加段时间	fur_intime_heat2
 * 	在均热段时间	fur_intime_soak
 * 	预热段出口温度	fur_temp_preheat
 * 	一加段出口温度	fur_temp_heat1
 * 	二加段出口温度	fur_temp_heat2
 * 	均热段出口温度	fur_temp_soak
 * 	出炉温度	fur_exittemp
 */
@Data
public class Heating {
    private	Double	fur_chargetemp	;
    private	String	fur_chargetime	;
    private	String	fur_extracttime	;
    private	Double	fur_intime	;
    private	Double	fur_intime_preheat	;
    private	Double	fur_intime_heat1	;
    private	Double	fur_intime_heat2	;
    private	Double	fur_intime_soak	;
    private	Double	fur_temp_preheat	;
    private	Double	fur_temp_heat1	;
    private	Double	fur_temp_heat2	;
    private	Double	fur_temp_soak	;
    private	Double	fur_exittemp	;


}
