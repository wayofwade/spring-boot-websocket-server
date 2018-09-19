package com.cblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/*1-RestController使这个类成为controller层
* 2-SpringBootApplication启动这个类就可以访问
* 3-ComponentScan填写需要扫描的类之前填写com.cblog.controller导致service不能注入
* 4-@Component
* ******************主类***************
* */
@SpringBootApplication
@EnableScheduling
// @ComponentScan("com.cblog")
@MapperScan("com.cblog.dao")
public class CblogApplication {

	public static void main(String[] args) {
		SpringApplication.run(CblogApplication.class, args);
	}
}
