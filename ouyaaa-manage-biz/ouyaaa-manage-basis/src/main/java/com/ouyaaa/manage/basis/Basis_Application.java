package com.ouyaaa.manage.basis;

import com.ouyaaa.common.swagger.annotation.CustomSwagger;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(exclude = {MultipartAutoConfiguration.class})
@EnableCaching
@EnableEurekaClient
@EnableDiscoveryClient
@EnableRabbit
@CustomSwagger
public class Basis_Application {

	public static void main(String[] args) {
		SpringApplication.run(Basis_Application.class, args);
	}
}
