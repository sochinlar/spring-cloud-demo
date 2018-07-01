package com.example.webserviceeurekaclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    private static final Logger log=LoggerFactory.getLogger(IndexController.class);

    @Value("${server.port:null}")
    private String port;

    @RequestMapping("/")
    public Object index(){
        log.info("-----------welcome to web-service-eureka-client!----------------");
        return "welcome to web-service-eureka-client!";
    }

    @RequestMapping("/port")
    public Object serverPort(){
        log.info("-----------------------service port---------------------------"+port);
        return port;
    }

}
