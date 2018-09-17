package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*使这个类成为controller层*/
@RestController
@SpringBootApplication
public class CblogApplication {

	public static void main(String[] args) {
		SpringApplication.run(CblogApplication.class, args);
	}
	@RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
	String index(){
		return "Hello Spring Boot!";
	}
}
