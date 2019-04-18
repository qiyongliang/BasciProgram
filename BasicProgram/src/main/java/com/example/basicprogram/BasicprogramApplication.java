package com.example.basicprogram;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author qyl
 * @date 2019-04-03
 */

/**
 * 扫描的mapper配置
 */
@MapperScan("com.example.basicprogram.dao")

/**
 * springboot自动化配置
 */
@SpringBootApplication
public class BasicprogramApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicprogramApplication.class, args);
    }

}
