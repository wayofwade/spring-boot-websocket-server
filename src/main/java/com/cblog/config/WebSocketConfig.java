package com.cblog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) { // 这个是连接前端的消息
        System.out.println("WebSocketConfig1========>>>>>>>>>");
        // 设置跨域访问，是为了返回值给前端，前端端口8081
        registry.addEndpoint("/websocket-endpoint").setAllowedOrigins("*").setAllowedOrigins("http://localhost:8081").withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) { // 发送给前端的消息
        System.out.println("WebSocketConfig2=========>>>>>>>>>>");
        //向客户端发送信息时，destination的前缀必须是配置中的global-message
        registry.enableSimpleBroker("/global-message");
        registry.setApplicationDestinationPrefixes("/app-receive");
    }
}
