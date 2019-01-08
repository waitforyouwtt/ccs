package com.yidiandian;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@MapperScan({"com.yidiandian.mapper","com.yidiandian.dao"})
@EnableEurekaClient
@SpringBootApplication
public class CcsServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CcsServerApplication.class, args);
    }

}

