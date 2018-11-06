package com.badboy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * https://blog.csdn.net/gosaint/article/details/83089956
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class BadboyCloudConfigServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(BadboyCloudConfigServerApplication.class, args);
	}
}
