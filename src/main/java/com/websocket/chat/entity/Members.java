package com.websocket.chat.entity;

import com.websocket.chat.constant.Role;
import com.websocket.chat.constant.SubscriptionLevel;
import javax.persistence.*;
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
@Table(name = "Members")
@NoArgsConstructor
@ToString
public class Members {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_id")
    private Long member_id;

    private int email;

    private String name;

    private String phone_number;

    private Timestamp registered_at;

    private String address;

    private String image_path;

    private SubscriptionLevel subscriptionLevel;

    private Role role;

    private Timestamp updated_at;

    @OneToMany(mappedBy = "members", cascade = CascadeType.ALL, orphanRemoval = true )
    private List<ChatRoomMembers> chatRoomMembersList = new ArrayList<>();
}
