package com.my.nacosconfigdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author marshal
 * @Date 2021-04-07 10:33 PM
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    //    @Value("${useLocalCache:false}")
    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    /**
     * 1. 先向Nacos Server 发布配置：
     * curl -X POST "http://127.0.0.1:8848/nacos/v1/cs/configs?dataId=nacos-config-demo.properties&group=DEFAULT_GROUP&content=useLocalCache=true"
     *
     * @return
     */
    @GetMapping("/get")
    public boolean get() {
        return useLocalCache;
    }

}
