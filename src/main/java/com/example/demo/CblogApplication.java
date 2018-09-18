package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*1-RestController使这个类成为controller层
* 2-SpringBootApplication启动这个类就可以访问
* 3-ComponentScan填写需要扫描的类
* ******************主类***************
* */
@RestController
@SpringBootApplication
@EnableScheduling
@ComponentScan("com.cblog.controller")
public class CblogApplication {

	public static void main(String[] args) {
		SpringApplication.run(CblogApplication.class, args);
	}
	@RequestMapping(value = "/ww",produces = "text/plain;charset=UTF-8")
	String index(){
		return "Hello Spring Boot!";
	}
    @RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
    String indexs(){
        return "Hello Spring Boot12323!";
    }
}
