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

    /**
     * 直接通过项目的访问地址来调用
     *
     * @return
     */
    @GetMapping("/callHello")
    public String callHello() {
        return restTemplate.getForObject("http://localhost:9601/user/hello", String.class);
    }

    /**
     * 通过eureka注册服务来调用
     *
     * @return
     */
    @GetMapping("/callHello2")
    public String callHello2() {
        return restTemplate.getForObject("http://eureka-client-user-service/user/hello", String.class);
    }
}
