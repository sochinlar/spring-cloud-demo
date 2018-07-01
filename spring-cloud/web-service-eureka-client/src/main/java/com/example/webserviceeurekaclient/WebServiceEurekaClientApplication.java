package com.example.webserviceeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WebServiceEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebServiceEurekaClientApplication.class, args);
    }
}
