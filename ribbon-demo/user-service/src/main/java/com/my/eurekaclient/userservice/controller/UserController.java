package com.my.eurekaclient.userservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author marshal
 * @Date 12/10/20 8:10 PM
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/getCurrentUser")
    public String getCurrentUser() {
        return "I an admin, i from port:  " + port;
    }

}
