package com.badboy.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan
@EnableAutoConfiguration
@EnableCircuitBreaker  //熔断器
@EnableHystrixDashboard //仪表盘
@EnableFeignClients
@MapperScan(basePackages = "com.badboy.cloud")
public class BadboyCloudProUserApp {
    public static void main( String[] args ){
    	SpringApplication.run(BadboyCloudProUserApp.class, args);
    }
}
