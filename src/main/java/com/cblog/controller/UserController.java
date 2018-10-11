package com.cblog.controller;

import com.cblog.common.CommonRes;
import com.cblog.domain.User;
import com.cblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    /*
    * 添加新的用户
    * */
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


    /*
    * 更新用户信息
    * */
    @ResponseBody
    @RequestMapping(value="/updateUser",method= RequestMethod.POST)
    public CommonRes updateUser(@RequestBody User user){
        return null;
    }

    /*
    * * 删除用户信息
    * */
    @ResponseBody
    @RequestMapping(value="/deleteUser",method= RequestMethod.POST)
    public CommonRes deleteUser(@RequestBody User user){
        return null;
    }

    /*
    * 根据用户id查询用户信息
    * */
    @ResponseBody
    @RequestMapping(value="/getUser",method= RequestMethod.POST)
    public CommonRes getUser(@RequestParam(required = true)  Integer id){
        System.out.println(id);
        return null;
    }
}
