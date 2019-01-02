package com.hjl.produce;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProduceStartUp {

    public static  void main(String [] agrs){
        SpringApplication.run(ProduceStartUp.class,agrs);
    }
}
