package com.hjl.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonHelloController {

    @Autowired
    private RestTemplate restTemplate;

    public String hello(){
        String template = restTemplate.getForObject("http://produce/hello", String.class);
        return "hello";
    }

}
