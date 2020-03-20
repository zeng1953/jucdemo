package com.cisdi.numbercoil.service;

import com.cisdi.numbercoil.bean.FilterConditionsResult;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface ConditionsService {
    ArrayList<String> getAllCoilConditions();
    ArrayList<FilterConditionsResult> getCoilConditions(String page);
}
