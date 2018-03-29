package com.hello.chatbot.api.domain;

import com.hello.chatbot.common.data.BotActionType;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "cb_actions")
public class BotActions implements Serializable{

    @Id
    @Column(name = "action_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int actionId;

    @Column(name = "action_name")
    private String actionName;

    @Enumerated(EnumType.STRING)
    @Column(name = "action_type", nullable = false)
    private BotActionType type;

    @ManyToOne(targetEntity = BotEvents.class)
    @JoinColumn(name = "event_id", nullable = false)
    private BotEvents event;

    @Column(name = "action_context")
    private String context;

    public int getActionId() {
        return actionId;
    }

    public void setActionId(int actionId) {
        this.actionId = actionId;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public BotActionType getType() {
        return type;
    }

    public void setType(BotActionType type) {
        this.type = type;
    }

    public BotEvents getEvent() {
        return event;
    }

    public void setEvent(BotEvents event)
    {
        this.event = event;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
