package com.websocket.chat.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ChatRoomMembersPK implements Serializable {

    private int chatRoomId;
    private int memberId;

    // 기본 생성자, equals(), hashCode() 메소드 구현
}