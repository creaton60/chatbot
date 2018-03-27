package com.hello.chatbot.api.repository;

import com.hello.chatbot.api.domain.BotChatLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatLogRepository extends JpaRepository<BotChatLog, Integer>{
}
