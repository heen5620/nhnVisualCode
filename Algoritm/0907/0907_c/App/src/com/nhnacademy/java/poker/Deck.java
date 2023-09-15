package com.nhnacademy.java.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    static final int allCard = Card.CardShape.values().length * Card.CardNumber.values().length;
    private ArrayList<Card> deck;
    Random random = new Random();

    public Deck() {
        deck = new ArrayList<Card>(allCard);
        for (Card.CardShape cardName : Card.CardShape.values()) {
            for (Card.CardNumber cardNumber : Card.CardNumber.values()) {
                deck.add(new Card(cardName, cardNumber));
            }
        }
    }

    public Card getCard(int index) {
        return deck.remove(index);
    }

    public Card getCard() {
        return deck.remove(random.nextInt(deck.size()));
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }
}
