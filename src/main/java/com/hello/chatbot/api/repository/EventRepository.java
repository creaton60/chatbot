package com.hello.chatbot.api.repository;

import com.hello.chatbot.api.domain.*;
import com.hello.chatbot.common.data.BotEventType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<BotEvents, Integer>{

    List<BotEvents> findByBotAndMenuAndEventSeq(Bots bot, BotMenu menu, int eventSeq);

    List<BotEvents> findByBotAndMenuAndEventSeqAndButton(Bots bot, BotMenu menu, int eventSeq, BotButtons button);

    List<BotEvents> findByBotAndMenuAndEventSeqAndCard(Bots bot, BotMenu menu, int eventSeq, BotCards card);

    List<BotEvents> findByBotAndEventType(Bots bot, BotEventType type);

    List<BotEvents> findByBotAndEventTypeAndEventSeqAndMenu(Bots bot, BotEventType type, int eventSeq, BotMenu menu);
}
