package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleApplicationsGithubApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplicationsGithubApplication.class, args);
	}

	@GetMapping("/welcome")
	public String getMessage() {
		return "Hello Everyone";
	}
}
