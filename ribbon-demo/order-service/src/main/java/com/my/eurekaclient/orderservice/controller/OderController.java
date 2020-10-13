package com.my.eurekaclient.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description TODO
 * @Author marshal
 * @Date 12/10/20 8:17 PM
 */
@RestController
@RequestMapping("/order")
public class OderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getCurrentUser")
    public String getCurrentUser() {
        // 调用 user-service 的 getCurrentUser 接口
        return restTemplate.getForObject("http://user-service/user/getCurrentUser", String.class);
    }

}
