package com.hello.chatbot.api.domain;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "cb_chat_log")
public class BotChatLog implements Serializable{

    private int logId;

    private int botId;

    private String logDesc;

    private Date logDate;
}
