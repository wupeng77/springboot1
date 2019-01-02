package com.hjl.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient("produce")
public class RibbonStartUp {
     public static void main(String [] args){
         SpringApplication.run(RibbonStartUp.class,args);
     }

     @Bean
     public RestTemplate getrestTemplate(){
         return new RestTemplate();
     }
}
