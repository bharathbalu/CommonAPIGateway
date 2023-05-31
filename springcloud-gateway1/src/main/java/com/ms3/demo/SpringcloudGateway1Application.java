package com.ms3.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class SpringcloudGateway1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudGateway1Application.class, args);
	}

}
