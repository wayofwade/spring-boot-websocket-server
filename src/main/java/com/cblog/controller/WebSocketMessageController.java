package com.cblog.controller;
import com.cblog.common.CommonRes;
import com.cblog.domain.ai;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class WebSocketMessageController {


    @SendTo("/global-message/tick") // 这个是返回的地址==就是前端的接收地址
    @MessageMapping("/from-client")
    public String fromClient(String content) throws Exception {
        System.out.println("来自客户端的呃消息啊啊啊啊啊啊啊");
        Thread.sleep(1000);
        ai ais = new ai();
        String text = ais.人工智能(content);
        CommonRes res = new CommonRes();
        res.setRc(0);
        res.setMsgInfo("来自服务端的消息细嗅嘻嘻嘻嘻嘻");
        // return "Hello, 德玛西亚" + content;
        return text;
        // return res;
    }
}
