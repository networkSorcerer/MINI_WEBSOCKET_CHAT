package com.websocket.chat.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "messages")
@NoArgsConstructor
@ToString
public class Messages {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "chat_room_id")
    private ChatRooms chatRooms;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Members members;
    
    private String content;

    private boolean is_read;
}
