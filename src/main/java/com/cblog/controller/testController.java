package com.cblog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chencc on 2018/9/18.
 */
@RestController
public class testController {
    @RequestMapping(value = "/test",produces = "text/plain;charset=UTF-8")
    String index(){
        return "Hello Spring Boot!testetee";
    }
}
