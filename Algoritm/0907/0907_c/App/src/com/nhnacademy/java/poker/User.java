package com.nhnacademy.java.poker;

import java.util.List;

public class User {
    private String name;
    private List<Card> hand;

    public User(String name) {
        this.name = name;
        this.hand = hand;
    }

    public String getName() {
        return this.name;
    }

    public List<Card> getHand() {
        return this.hand;
    }

    public void setHand(List<Card> hand2) {
        this.hand = hand2;
    }
}
