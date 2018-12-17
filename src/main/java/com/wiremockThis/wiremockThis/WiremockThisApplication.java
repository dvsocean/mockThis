package com.wiremockThis.wiremockThis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})//to disable auto config for mongo
public class WiremockThisApplication {

	public static void main(String[] args) {
		SpringApplication.run(WiremockThisApplication.class, args);
	}
}
