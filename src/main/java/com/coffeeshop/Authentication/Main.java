package com.coffeeshop.Authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@GetMapping("/")
	public String root(){
		return "This is root page";
	}
	@GetMapping("/home")
	public String home(){
		return "This is home page";
	}
	@GetMapping("/admin")
	public String admin(){
		return "This is admin page";
	}

}
