package com.qf;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication

public class QfShopCartApplication {

    public static void main(String[] args) {
        SpringApplication.run(QfShopCartApplication.class, args);
    }

}
