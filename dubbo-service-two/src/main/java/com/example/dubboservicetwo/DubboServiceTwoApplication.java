package com.example.dubboservicetwo;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfig
@DubboComponentScan("com.example.dubboserviceone.service.dubbo")
public class DubboServiceTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboServiceTwoApplication.class, args);
    }

}
