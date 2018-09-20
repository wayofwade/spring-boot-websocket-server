package com.cblog.controller;

import com.cblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by chencc on 2018/9/18.
 */
@RestController
@RequestMapping("/main")
public class UserController {
    @Autowired
    private UserService testService;

    @RequestMapping(value = "/test",produces = "text/plain;charset=UTF-8")
    String index(){
        // testService.testMybatis();
        return "Hello Spring Boot!testetee";
    }

    @RequestMapping(value = "/saveUser",produces = "text/plain;charset=UTF-8")
    public String saveUserInfo(){
        Map<String, Object> map=new HashMap<>();
        map.put("userName", "yzk");
        map.put("passWord", "test");
        int a = testService.saveUserInfo(map);
        String b = String.valueOf(a);
        return b;
    }
}
