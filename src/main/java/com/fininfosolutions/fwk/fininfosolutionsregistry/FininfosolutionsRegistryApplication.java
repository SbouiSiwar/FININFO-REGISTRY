package com.fininfosolutions.fwk.fininfosolutionsregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FininfosolutionsRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FininfosolutionsRegistryApplication.class, args);
	}

}
