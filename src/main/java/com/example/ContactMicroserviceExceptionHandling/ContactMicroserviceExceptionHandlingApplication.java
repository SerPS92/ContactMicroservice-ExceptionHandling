package com.example.ContactMicroserviceExceptionHandling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class ContactMicroserviceExceptionHandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactMicroserviceExceptionHandlingApplication.class, args);
		System.out.println(SpringVersion.getVersion());
	}

}
