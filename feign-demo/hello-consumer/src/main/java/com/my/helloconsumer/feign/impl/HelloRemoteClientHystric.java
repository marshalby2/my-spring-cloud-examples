package com.my.helloconsumer.feign.impl;

import com.my.helloconsumer.feign.HelloRemoteClient;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author marshal
 * @Date 14/10/20 9:22 AM
 */
@Component
public class HelloRemoteClientHystric implements HelloRemoteClient {
    @Override
    public String hello(String name) {
        return "sorry, system error";
    }
}
