package com.my.eurekaclient.orderservice.service.impl;

import com.my.eurekaclient.orderservice.service.OderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description TODO
 * @Author marshal
 * @Date 14/10/20 9:06 AM
 */
@Service
public class OderServiceImpl implements OderService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "error")
    public String getCurrentUser() {
        // 调用 user-service 的 getCurrentUser 接口
        return restTemplate.getForObject("http://user-service/user/getCurrentUser", String.class);
    }

    @Override
    public String error() {
        return "OderService: sorry, system error";
    }
}
