package com.my.servicehello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author marshal
 * @Date 17/10/20 11:07 PM
 */
@RestController
public class HelloController {

    /**
     *  直接访问：http://localhost:9601/hello
     *  通过zuul访问： http://localhost:9602/service-hello/hello
     *
     *
     * @return
     */
    @GetMapping("/hello")
    public String hello() {
        return "hello, this is service-hello";
    }

}
