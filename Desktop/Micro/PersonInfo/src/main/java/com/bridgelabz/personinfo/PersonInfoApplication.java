package com.bridgelabz.personinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PersonInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonInfoApplication.class, args);
	}

}
