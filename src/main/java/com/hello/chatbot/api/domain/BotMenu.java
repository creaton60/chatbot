package com.hello.chatbot.api.domain;

import com.hello.chatbot.common.data.BillType;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "cb_menu")
public class BotMenu implements Serializable{

    @Id
    @Column(name = "menu_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int menuId;

    @Column(name = "menu_name")
    private String menuName;

    @ManyToOne(targetEntity = Bots.class)
    @JoinColumn(name = "bot_id")
    private Bots botId;

    @Enumerated(EnumType.STRING)
    @Column(name = "bill_type")
    private BillType billType;

    @Column(name = "menu_price", columnDefinition = "int default 0")
    private int price;


    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Bots getBotId() {
        return botId;
    }

    public void setBotId(Bots botId) {
        this.botId = botId;
    }

    public BillType getBillType() {
        return billType;
    }

    public void setBillType(BillType billType) {
        this.billType = billType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
