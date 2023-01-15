package com.hdsaison.microservices.hds.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
    "com.hdsaison.microservices.hds.common",
})
public class HdsBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(HdsBatchApplication.class, args);
	}

}
