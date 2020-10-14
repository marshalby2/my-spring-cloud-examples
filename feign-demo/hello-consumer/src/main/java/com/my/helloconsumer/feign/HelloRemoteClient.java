package com.my.helloconsumer.feign;

import com.my.helloconsumer.config.FeignConfig;
import com.my.helloconsumer.feign.impl.HelloRemoteClientHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description TODO
 * @Author marshal
 * @Date 9/10/20 10:10 AM
 */
@FeignClient(name = "hello-producer", configuration = FeignConfig.class, fallback = HelloRemoteClientHystric.class)
public interface HelloRemoteClient {

    @GetMapping("/producer/hello")
    String hello(@RequestParam String name);

}
