package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/message")
	public String message(){
<<<<<<< HEAD
		return "Spring Boot Azure Demo - test ";
=======
		return "Spring Boot Azure Demo.";
>>>>>>> ded73a8b97c2e744752f0f63cce7138db8129cc7
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
