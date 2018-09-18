package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*1-RestController使这个类成为controller层
* 2-SpringBootApplication启动这个类就可以访问
* 3-ComponentScan填写需要扫描的类
* */
@RestController
@SpringBootApplication
@ComponentScan("com.cblog.controller")
public class CblogApplication {

	public static void main(String[] args) {
		SpringApplication.run(CblogApplication.class, args);
	}
	@RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
	String index(){
		return "Hello Spring Boot!";
	}
}
