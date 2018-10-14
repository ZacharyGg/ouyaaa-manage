package com.ouyaaa.manage.produce;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableCaching
@EnableEurekaClient
@EnableDiscoveryClient
@EnableRabbit
public class Produce_Application {

	public static void main(String[] args) {
		SpringApplication.run(Produce_Application.class, args);
	}
}
