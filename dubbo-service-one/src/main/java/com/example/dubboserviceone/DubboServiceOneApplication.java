package com.example.dubboserviceone;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfig
@DubboComponentScan("com.example.dubboserviceone.service.dubbo")
public class DubboServiceOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboServiceOneApplication.class, args);
    }

}
