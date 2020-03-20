package com.cisdi.numbercoil.bean.coilDetail;

import lombok.Data;

/**
 * 钢卷统计信息
 * 	平直度头100m对称性精度	symflat_accuracy_head
 * 	平直度头100m非对称性精度	asymflat_accuracy_head
 * 	钢卷统计信息	symflat_accuracy_tail
 * 	平直度尾100m非对称性精度	asymflat_accuracy_tail
 * 	楔形头段精度	wedge_head_part
 * 	楔形中段精度	wedge_mid_part
 * 	楔形尾段精度	wedge_tail_part
 * 	楔形头段绝对值平均值	wedge_meanhead_part
 * 	楔形中段绝对值平均值	wedge_meanmid_part
 * 	楔形尾段绝对值平均值	wedge_meantail_part
 * 	楔形全长精度	wedge_accuracy_all
 * 	楔形全长均值	wedge_mean_all
 * 	楔形全长方差	wedge_variance
 * 	凸度头段精度	crown_head_part
 * 	凸度中段精度	crown_mid_part
 * 	凸度尾段精度	crown_tail_part
 * 	凸度头段均值	crown_meanhead_part
 * 	凸度中段均值	crown_meanmid_part
 * 	凸度尾段均值	crown_meantail_part
 * 	凸度全长精度	crown_accuracy_all
 * 	凸度全长均值	crown_mean_all
 * 	凸度全长极差值	crown_range_all
 * 	厚度全长精度	thick_accuracy_all
 * 	厚度分段精度头部	thick_accuracy_head
 * 	厚度分段精度中部	thick_accuracy_body
 * 	厚度分段精度尾部	thick_accuracy_tail
 * 	宽度全长精度	width_accuracy_all
 * 	宽度分段精度头部	width_accuracy_head
 * 	宽度分段精度中部	width_accuracy_body
 * 	宽度分段精度尾部	width_accuracy_tail
 * 	宽度头部极差	width_range_head
 * 	宽度本体偏差	width_range_body
 * 	宽度尾部极差	width_range_tail
 * 	RT2全长均值	RT2_mean_all
 * 	RT2全长极差值	RT2_range_all
 * 	FT7全长精度	RT7_accuracy_all
 * 	FT7分段精度头部	RT7_accuracy_head
 * 	FT7分段精度中部	RT7_accuracy_body
 * 	FT7分段精度尾部	RT7_accuracy_tail
 * 	FT7全长极差值	RT7_range_all
 * 	FT7全长均值	RT7_mean_all
 * 	FT7分段均值头部	RT7_mean_head
 * 	FT7分段均值中部	RT7_mean_body
 * 	FT7分段均值尾部	RT7_mean_tail
 * 	CT全长精度	CT_accuracy_all
 * 	CT分段精度头部	CT_accuracy_head
 * 	CT分段精度中部	CT_accuracy_body
 * 	CT分段精度尾部	CT_accuracy_tail
 * 	CT全长极差值	CT_range_all
 * 	CT全长均值	CT_mean_all
 * 	CT分段均值头部	CT_mean_head
 * 	CT分段均值中部	CT_mean_body
 * 	CT分段均值尾部	CT_mean_tail
 * 	CT头部极差	CT_range_head
 * 	CT尾部极差	CT_range_tail
 * 	CT中部极差	CT_range_body
 * 	CS全长均值	CS_mean_all
 */
@Data
public class CoilStatistics {
    private	Double	symflat_accuracy_head	;
    private	Double	asymflat_accuracy_head	;
    private	Double	symflat_accuracy_tail	;
    private	Double	asymflat_accuracy_tail	;
    private	Double	wedge_head_part	;
    private	Double	wedge_mid_part	;
    private	Double	wedge_tail_part	;
    private	Double	wedge_meanhead_part	;
    private	Double	wedge_meanmid_part	;
    private	Double	wedge_meantail_part	;
    private	Double	wedge_accuracy_all	;
    private	Double	wedge_mean_all	;
    private	Double	wedge_variance	;
    private	Double	crown_head_part	;
    private	Double	crown_mid_part	;
    private	Double	crown_tail_part	;
    private	Double	crown_meanhead_part	;
    private	Double	crown_meanmid_part	;
    private	Double	crown_meantail_part	;
    private	Double	crown_accuracy_all	;
    private	Double	crown_mean_all	;
    private	Double	crown_range_all	;
    private	Double	thick_accuracy_all	;
    private	Double	thick_accuracy_head	;
    private	Double	thick_accuracy_body	;
    private	Double	thick_accuracy_tail	;
    private	Double	width_accuracy_all	;
    private	Double	width_accuracy_head	;
    private	Double	width_accuracy_body	;
    private	Double	width_accuracy_tail	;
    private	Double	width_range_head	;
    private	Double	width_range_body	;
    private	Double	width_range_tail	;
    private	Double	RT2_mean_all	;
    private	Double	RT2_range_all	;
    private	Double	RT7_accuracy_all	;
    private	Double	RT7_accuracy_head	;
    private	Double	RT7_accuracy_body	;
    private	Double	RT7_accuracy_tail	;
    private	Double	RT7_range_all	;
    private	Double	RT7_mean_all	;
    private	Double	RT7_mean_head	;
    private	Double	RT7_mean_body	;
    private	Double	RT7_mean_tail	;
    private	Double	CT_accuracy_all	;
    private	Double	CT_accuracy_head	;
    private	Double	CT_accuracy_body	;
    private	Double	CT_accuracy_tail	;
    private	Double	CT_range_all	;
    private	Double	CT_mean_all	;
    private	Double	CT_mean_head	;
    private	Double	CT_mean_body	;
    private	Double	CT_mean_tail	;
    private	Double	CT_range_head	;
    private	Double	CT_range_tail	;
    private	Double	CT_range_body	;
    private	Double	CS_mean_all	;

}
