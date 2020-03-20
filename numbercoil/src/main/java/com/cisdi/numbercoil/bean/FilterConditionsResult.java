package com.cisdi.numbercoil.bean;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilterConditionsResult {
    private String id;
    private String label;
    private List<Children> children;


    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}
