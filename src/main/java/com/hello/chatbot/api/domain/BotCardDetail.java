package com.hello.chatbot.api.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "cb_card_detail")
public class BotCardDetail implements Serializable{

    @Id
    @Column(name = "card_detail_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int detailId;

    @Column(name = "card_detail_name")
    private String cardName;

    @ManyToOne(targetEntity = BotCards.class)
    @JoinColumn(name = "card_id")
    private BotCards card;

    @Column(name = "card_detail_desc")
    private String desc;

    @Column(name = "card_image_path")
    private String imagePath;

    @Column(name = "card_direction" , nullable = false, columnDefinition = "int default 0")
    private int direction;

    public int getDetailId() {
        return detailId;
    }

    public void setDetailId(int detailId) {
        this.detailId = detailId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public BotCards getCard() {
        return card;
    }

    public void setCard(BotCards card) {
        this.card = card;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
