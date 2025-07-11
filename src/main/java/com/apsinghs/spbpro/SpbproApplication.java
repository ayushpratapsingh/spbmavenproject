package com.apsinghs.spbpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RequestMapping("/spring-boot")
@RestController
public class SpbproApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpbproApplication.class, args);
	}
	@GetMapping("/hello")
       public String firstApp(@RequestParam(value = "name", defaultValue = "Coder") String name) 
	   {
       return String.format("Congratulationss  %s, you've built your first Spring Boot Application from Scratch in prod env!!", name);
       }

}
