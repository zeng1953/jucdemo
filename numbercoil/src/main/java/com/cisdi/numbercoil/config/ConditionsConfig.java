package com.cisdi.numbercoil.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "data")
@Data
public class ConditionsConfig {
    private Map<String,String> condition = new HashMap<>();

}
