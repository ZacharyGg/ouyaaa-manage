package com.ouyaaa.auth;

import com.ouyaaa.auth.propertis.SecurityProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableConfigurationProperties(SecurityProperties.class)
public class Authentication_Application {

	public static void main(String[] args) {
		SpringApplication.run(Authentication_Application.class, args);
	}
}
