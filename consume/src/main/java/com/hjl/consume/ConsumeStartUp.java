package com.hjl.consume;


import com.netflix.discovery.EurekaClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumeStartUp {

    public static void main(String [] args){
        SpringApplication.run(ConsumeStartUp.class,args);
    }

    @Bean
    public RestTemplate getRest(){
        return new RestTemplate();
    }

}
