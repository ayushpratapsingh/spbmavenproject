package com.apsinghs.spbpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
       return String.format("Congratulationss  %s, you've built your first Spring Boot Application from Scratch!!", name);
       }

}
