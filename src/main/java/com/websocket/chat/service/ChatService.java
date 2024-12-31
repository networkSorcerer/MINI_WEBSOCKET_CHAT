package com.websocket.chat.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.websocket.chat.dto.ChatRoomResDto;
import com.websocket.chat.entity.ChatRoomMembers;
import com.websocket.chat.entity.ChatRooms;
import com.websocket.chat.entity.Members;
import com.websocket.chat.repository.ChatRoomMembersRepository;
import com.websocket.chat.repository.ChatRoomsRepository;
import com.websocket.chat.repository.MembersRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Slf4j
@RequiredArgsConstructor
@Service
public class ChatService {
    private final ObjectMapper objectMapper;
    private final ChatRoomsRepository chatRoomsRepository;
    private final ChatRoomMembersRepository chatRoomMembersRepository;
    private final MembersRepository membersRepository;
    private Map<String, ChatRoomResDto> chatRooms;

    // 채팅방 생성은 원래대로 + DB
    // 채팅방 생성후 멤버 는 따로 검색 해서 채팅방 멤버로 DB저장
    // message 도 DB 저장

    @PostConstruct // 의존성 주입 이후 초기화를 수행하는 메서드
    private void init(){
        chatRooms = new LinkedHashMap<>(); // 채팅 방 정보를 담을 맵
    }




}
