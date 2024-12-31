package com.websocket.chat.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Service;

@Getter
@Setter
@ToString
public class ChatRoomReqDto {
    private String email;
    private String name;
}
