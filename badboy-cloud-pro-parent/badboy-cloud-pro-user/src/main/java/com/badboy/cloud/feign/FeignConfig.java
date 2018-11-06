package com.badboy.cloud.feign;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Contract;
import feign.Retryer;

import static java.util.concurrent.TimeUnit.SECONDS;

@Configuration
public class FeignConfig {
	 /**
     * feign默认的配置在请求失败后，不会再重试，所以，现在希望在请求失败后能够重试
     * Retryer更改feignclient的请求失败重试策略，重试间隔为100毫秒，最大重试时间为1秒，重试次数为5次
     * @return
     */
    @Bean
    public Retryer feignRetryer(){
        return new Retryer.Default(100,SECONDS.toMillis(1),5);
    }
    
    @Bean
    public Contract feignConfiguration(){
        return new feign.Contract.Default();
    }
}
