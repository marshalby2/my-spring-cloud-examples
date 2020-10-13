package com.my.eurekaclienthelloservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author marshal
 * @Date 12/10/20 7:36 PM
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/greet")
    public String greet() {
        return "hello";
    }
}
