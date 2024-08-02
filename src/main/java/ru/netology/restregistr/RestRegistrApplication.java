package ru.netology.restregistr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestRegistrApplication {
	public static void main(String[] args) {
		SpringApplication.run(RestRegistrApplication.class, args);
		System.out.println("Application started successfully.");
	}
}