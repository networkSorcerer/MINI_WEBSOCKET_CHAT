package com.websocket.chat.repository;

import com.websocket.chat.entity.ChatRooms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRoomsRepository extends JpaRepository<ChatRooms, Long> {
}
