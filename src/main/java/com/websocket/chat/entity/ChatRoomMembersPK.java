package com.websocket.chat.entity;

import javax.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ChatRoomMembersPK implements Serializable {

    private Long chat_room_id;
    private Long member_id;

    // 기본 생성자, equals(), hashCode() 메소드 구현
}