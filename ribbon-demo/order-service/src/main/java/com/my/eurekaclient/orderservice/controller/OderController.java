package com.my.eurekaclient.orderservice.controller;

import com.my.eurekaclient.orderservice.service.OderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author marshal
 * @Date 12/10/20 8:17 PM
 */
@RestController
@RequestMapping("/order")
public class OderController {

    @Autowired
    private OderService oderService;

    @GetMapping("/getCurrentUser")
    public String getCurrentUser() {
        return oderService.getCurrentUser();
    }

}
