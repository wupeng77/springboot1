package com.hjl.consume.controller;


import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumeController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("hello")
    public String hello(){
        String object = restTemplate.getForObject("http://localhost:8081/hello", String.class);
        return "hello"+object;
    }

    @GetMapping("helloeruke")
    public String erukehello(){
        InstanceInfo nextServerFromEureka = eurekaClient.getNextServerFromEureka("produce", false);
        String homePageUrl = nextServerFromEureka.getHomePageUrl();
        String object = restTemplate.getForObject(homePageUrl+"/hello", String.class);
        return "hello"+object;
    }

}
