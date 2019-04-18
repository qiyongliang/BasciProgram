package com.example.basicprogram.database;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author qiyongliang
 * @date 2019/4/8-11:54
 */
@Configuration
@PropertySource("classpath:custom.properties")
public class PropertyConfiguration {

    private String strPort;
    @Value("${server.port}")
    public void  PropertyConfiguration1(String port){
        strPort =port;
    }
}
