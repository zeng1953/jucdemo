package com.cisdi.numbercoil.bean;


import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.Map;

@Data
public class CoilInfo {
    @Id
    private String coilNo;//钢卷号

    private Map<String, Object> coilDetail;//钢卷明细

    private Date createTime;//创建时间
}
