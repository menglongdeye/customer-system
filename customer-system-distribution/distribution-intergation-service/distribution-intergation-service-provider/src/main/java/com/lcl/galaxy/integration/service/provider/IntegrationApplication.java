package com.lcl.galaxy.integration.service.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDubbo
public class IntegrationApplication {

    @Bean
    public RestTemplate restTemplate() {
        //注入RestTemplate
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(IntegrationApplication.class, args);
    }
}
