package com.cblog.controller;

import com.cblog.common.CommonRes;
import org.springframework.web.bind.annotation.*;

/**
 * Created by chencc on 2019/1/29.
 */
@RestController
@RequestMapping(value="/socket")
public class WebSocketController {

    /*
    * 根据用户id查询用户信息
    * */
    @ResponseBody
    @RequestMapping(value="/getMessage",method= RequestMethod.GET)
    public CommonRes getUser(@RequestParam(required = true)  String text){
        System.out.println(text);
        CommonRes res = new CommonRes();
        res.setRc(0);
        res.setMsgInfo("德玛西亚你说什么啊");
        return res;
    }

}
