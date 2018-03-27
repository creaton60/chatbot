package com.hello.chatbot.api.repository;

import com.hello.chatbot.api.domain.BotEvents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<BotEvents, Integer>{
}
