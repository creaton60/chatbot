package com.hello.chatbot.api.repository;

import com.hello.chatbot.api.domain.BotCardDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardDetailRepository extends JpaRepository<BotCardDetail, Integer>{
}
