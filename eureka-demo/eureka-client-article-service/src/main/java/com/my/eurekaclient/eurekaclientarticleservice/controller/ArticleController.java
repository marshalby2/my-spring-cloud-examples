package com.my.eurekaclient.eurekaclientarticleservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description TODO
 * @Author marshal
 * @Date 5/10/20 11:08 AM
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/callHello")
    public String callHello() {
        return restTemplate.getForObject("http://localhost:9601/user/hello", String.class);
    }
}
