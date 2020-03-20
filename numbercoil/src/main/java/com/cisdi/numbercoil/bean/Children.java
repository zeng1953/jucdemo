package com.cisdi.numbercoil.bean;

import lombok.Data;

@Data
public class Children {
    private String id;
    private String label;

    public Children(){

    }

    public Children(String id,String label){
        this.id = id;
        this.label = label;
    }
}
