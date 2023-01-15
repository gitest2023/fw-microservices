package com.hdsaison.microservices.hdsserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HdsServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(HdsServiceRegistryApplication.class, args);
	}

}
