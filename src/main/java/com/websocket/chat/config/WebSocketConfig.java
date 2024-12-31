package com.websocket.chat.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebMvcStompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;

@Slf4j
@Configuration
@RequiredArgsConstructor
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
    private final WebSocketHandler webSocketHandler;

    @Override
    public void registerWebSocketHandler(WebMvcStompEndpointRegistry registry) {
        log.info("소켓 핸들러 생성 ~~~~~~~~~~~~~~~");
        registry.addHandler(webSocketHandler, "ws/chat").setAllowedOrigins("*");
    }

}
