package com.javaspring.testservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDemoApplication {

	@GetMapping("/mymessage")
	public String getMessage() {
		return "This is my first springboot message from Azure";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

}
