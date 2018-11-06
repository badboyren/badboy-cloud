package com.badboy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan
@EnableAutoConfiguration
@EnableCircuitBreaker  //熔断器
@EnableHystrixDashboard //仪表盘
@EnableFeignClients
public class BadboyCloudProOrderApp {
    public static void main( String[] args ){
    	SpringApplication.run(BadboyCloudProOrderApp.class, args);
    }
}
