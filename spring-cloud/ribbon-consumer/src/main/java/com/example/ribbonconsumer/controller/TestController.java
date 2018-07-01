package com.example.ribbonconsumer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
    private static final Logger log=LoggerFactory.getLogger(TestController.class);

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("index")
    public Object getIndex(){
        ResponseEntity<String> entity = restTemplate.getForEntity("http://WEB-SERVICE-EUREKA-CLIENT/", String.class);
        String res=entity.getBody();
        log.info("-----------------------inedx----------------------"+res);
        return res;
    }

    @RequestMapping("port")
    public Object getServicePort(){
        ResponseEntity<String> entity = restTemplate.getForEntity("http://WEB-SERVICE-EUREKA-CLIENT/port", String.class);
        String res=entity.getBody();
        log.info("-----------------------web wervice port:----------------------"+res);
        return res;
    }
}
