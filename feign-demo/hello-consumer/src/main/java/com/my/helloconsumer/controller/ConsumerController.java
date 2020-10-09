package com.my.helloconsumer.controller;

import com.my.helloconsumer.feign.HelloRemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author marshal
 * @Date 9/10/20 10:08 AM
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    private HelloRemoteClient helloRemoteClient;

    @GetMapping("/hello/{name}")
    public String callHello(@PathVariable String name) {
        return helloRemoteClient.hello(name);
    }

}
