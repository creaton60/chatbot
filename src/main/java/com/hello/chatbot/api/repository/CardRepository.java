package com.hello.chatbot.api.repository;

import com.hello.chatbot.api.domain.BotCards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<BotCards, Integer>{
}
