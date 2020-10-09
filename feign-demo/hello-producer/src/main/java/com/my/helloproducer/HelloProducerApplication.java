package com.my.helloproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HelloProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloProducerApplication.class, args);
    }

}
