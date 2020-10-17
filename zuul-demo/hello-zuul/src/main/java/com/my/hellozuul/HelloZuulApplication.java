package com.my.hellozuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class HelloZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloZuulApplication.class, args);
    }

}
