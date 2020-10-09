package com.my.helloconsumer.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description TODO
 * @Author marshal
 * @Date 9/10/20 11:31 AM
 */
@Configuration
public class FeignConfig {

    /**
     *  日志级别
     *
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}
