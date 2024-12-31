package com.websocket.chat.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "chat_rooms")
@NoArgsConstructor
@ToString
public class ChatRooms {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "chat_room_id" )
    private Long chat_room_id;

    private String name;

    private boolean is_group;

    private Timestamp created_at;

    @OneToMany(mappedBy = "chat_rooms", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ChatRoomMembers> chatRoomMembersList = new ArrayList<>();
}
