package com.ouyaaa.upms;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(
		scanBasePackages = {"com.ouyaaa.upms","com.ouyaaa.transaction","com.ouyaaa.common"}
		,exclude = {MultipartAutoConfiguration.class}
		)
@EnableCaching
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class UpmsApplication {
	public static void main(String[] args) {
		SpringApplication.run(UpmsApplication.class, args);
	}
}
