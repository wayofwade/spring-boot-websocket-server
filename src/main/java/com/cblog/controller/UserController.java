package com.cblog.controller;

import com.cblog.common.CommonRes;
import com.cblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by chencc on 2018/9/18.
 */
@RestController
@RequestMapping(value="/user")
public class UserController {
    @Autowired
    private UserService testService;

    @RequestMapping(value = "/test",produces = "text/plain;charset=UTF-8")
    String index(){
        // testService.testMybatis();
        return "Hello Spring Boot!testetee";
    }
    @ResponseBody
    @RequestMapping(value = "/saveUser",method = RequestMethod.POST)
    public CommonRes saveUserInfo(@RequestParam Map<String, Object> map){
        /*前后端成功交互*/
        // map.put("userName", "yzk");
        // map.put("passWord", "test");
        int a = testService.saveUserInfo(map);
        String b = String.valueOf(a);
        CommonRes res = new CommonRes();
        return res;
    }
}
