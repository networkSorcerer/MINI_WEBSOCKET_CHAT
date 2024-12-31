package com.websocket.chat.repository;

import com.websocket.chat.entity.ChatRoomMembers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRoomMembersRepository extends JpaRepository<ChatRoomMembers, Long> {
}
