package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/*
* @SpringBootTest=测试的路径
* */
@RunWith(SpringRunner.class)
@SpringBootTest(classes={com.cblog.CblogApplication.class})
public class CblogApplicationTests {

	@Test
	public void contextLoads() {
	    // tesst
        System.out.println("hello,spring boot12343234");

    }


}
