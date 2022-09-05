package com.joseg.openfeigndemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class OpenFeignDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenFeignDemoApplication.class, args);
	}

}
