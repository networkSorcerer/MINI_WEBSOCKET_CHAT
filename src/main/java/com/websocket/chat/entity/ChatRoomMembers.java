package com.websocket.chat.entity;

import com.websocket.chat.constant.RoomRole;
import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@Table(name = "chat_room_members")
@NoArgsConstructor
@ToString
public class ChatRoomMembers {

    @EmbeddedId
    private ChatRoomMembersPK id;  // 복합 기본 키 사용

    @ManyToOne
    @JoinColumn(name = "chat_room_id",insertable = false, updatable = false)
    private ChatRooms chatRooms;

    @ManyToOne
    @JoinColumn(name = "member_id",insertable = false, updatable = false)
    private Members members;

    private int user_id;

    private RoomRole roomRole;

    private Timestamp joined_at;
}
