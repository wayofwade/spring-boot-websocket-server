package com.cblog.controller;

import com.cblog.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by chencc on 2018/9/18.
 */
@RestController
@RequestMapping("/ccc")
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test",produces = "text/plain;charset=UTF-8")
    String index(){
        testService.testMybatis();
        return "Hello Spring Boot!testetee";
    }
}
