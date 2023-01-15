package com.hdsaison.microservices.hds.web.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {
        "com.hdsaison.microservices.hds.common",
        "com.hdsaison.microservices.hds.bootstrap",
        "com.hdsaison.microservices.hds.web.management",
        "com.hdsaison.microservices.hds.test",
})
@EnableDiscoveryClient
public class HdsManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(HdsManagementApplication.class, args);
	}

}
