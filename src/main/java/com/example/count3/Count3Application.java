package com.example.count3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Count3Application {

	public static void main(String[] args) {
		SpringApplication.run(Count3Application.class, args);
	}
	
	@GetMapping("/yetAnother")
	public String hello(@RequestParam(value = "name", defaultValue = "..****YET ANOTHER DEPLOYMENT AND SERVICE****") String name) {
	return String.format("yep.. %s!", name);
	}

}
