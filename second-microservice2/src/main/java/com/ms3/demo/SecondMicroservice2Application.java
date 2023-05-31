package com.ms3.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient 
@SpringBootApplication
public class SecondMicroservice2Application {

	public static void main(String[] args) {
		SpringApplication.run(SecondMicroservice2Application.class, args);
	}

}
