package com.nhnacademy.java.poker;

// public class Card {

public class Card {

    CardShape cardName;
    CardNumber cardNumber;

    enum CardShape {
        SPD("Spade"), // 1등
        DIA("Diamond"), // 2등
        HRT("Heart"), // 3등
        CLO("Clover"); // 4등

        public String cardName;

        CardShape(String cardName) {
            this.cardName = cardName;
        }

        public String getCardName() {
            return cardName;
        }

        public String toString() {
            return this.cardName;
        }
    }

    enum CardNumber {
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13),
        ACE(14);

        public int cardNumber;

        CardNumber(int cardNumber) {
            this.cardNumber = cardNumber;
        }

        public int getNumberValue() {
            return cardNumber;
        }

        @Override
        public String toString() {
            return String.valueOf(cardNumber);
        }
    }

    public Card(CardShape cardName, CardNumber cardNumber) {

        this.cardName = cardName;
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "{" + this.cardName + "," + this.cardNumber + "}";
    }

}