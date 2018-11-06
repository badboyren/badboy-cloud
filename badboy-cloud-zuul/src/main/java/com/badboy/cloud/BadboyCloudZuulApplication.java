package com.badboy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@EnableAutoConfiguration
@Component
public class BadboyCloudZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(BadboyCloudZuulApplication.class, args);
	}
}
