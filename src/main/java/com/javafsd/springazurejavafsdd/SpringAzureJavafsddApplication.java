package com.javafsd.springazurejavafsdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAzureJavafsddApplication {

	public String message() {
		return "Succesfully deployed on Azure";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAzureJavafsddApplication.class, args);
	}

}
