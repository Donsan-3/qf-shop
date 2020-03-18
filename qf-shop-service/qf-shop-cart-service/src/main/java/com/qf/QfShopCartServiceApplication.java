package com.qf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.qf.mapper")
public class QfShopCartServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(QfShopCartServiceApplication.class, args);
    }

}
