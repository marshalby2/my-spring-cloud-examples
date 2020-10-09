package com.my.helloproducer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author marshal
 * @Date 9/10/20 10:04 AM
 */
@RestController
@RequestMapping("/producer")
public class ProducerController {

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "hello, " + name;
    }

}
