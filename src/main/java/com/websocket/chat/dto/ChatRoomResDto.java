package com.websocket.chat.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.socket.WebSocketSession;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Getter
@Setter
@Slf4j
@NoArgsConstructor
public class ChatRoomResDto {
    private Long roomId;
    private String name;
    private LocalDateTime regDate;

    @JsonIgnore // 직렬화 방지
    private Set<WebSocketSession> sessions; // 채팅방에 입장한 세션 정보를 담음

    // 채팅방에 포함된 세션이 비어있는지 확인
    public boolean isSessionEmpty() {
        return this.sessions.isEmpty();
    }

    @Builder
    public ChatRoomResDto(Long roomId, String name, LocalDateTime regDate){
        this.roomId = roomId;
        this.name = name;
        this.regDate = regDate;
        // 동시성 문제를 해결하기 위해서
        this.sessions = Collections.newSetFromMap(new ConcurrentHashMap<>());
    }


}
