package com.UST.SpringbootwithFigenClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringbootwithFigenClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootwithFigenClientApplication.class, args);
	}

}
