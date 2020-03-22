package com.example.dubboservicetwo;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfig
//这里扫描的所有rpc 相关的包，无论是作为消费者还是生产者
@DubboComponentScan("com.example.dubboserviceone.service.dubbo")
public class DubboServiceTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboServiceTwoApplication.class, args);
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("执行JVM ShutdownHook！！");
            }
        }));
    }

}
