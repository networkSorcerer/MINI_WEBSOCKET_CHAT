package com.websocket.chat.entity;

import com.websocket.chat.constant.RoomRole;
import jakarta.persistence.*;
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

    @ManyToOne
    @JoinColumn(name = "chat_room_id")
    private ChatRooms chatRooms;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Members members;

    private int user_id;

    private RoomRole roomRole;

    private Timestamp joined_at;
}
