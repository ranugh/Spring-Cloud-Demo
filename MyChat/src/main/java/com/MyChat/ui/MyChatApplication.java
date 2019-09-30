package com.MyChat.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class MyChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyChatApplication.class, args);
	}

}
