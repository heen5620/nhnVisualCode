package com.nhnacademy.java.poker;

public enum CardNumber {
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    ELEVEN("Jack"),
    TWELEVE("Queen"),
    THIRTEEN("King"),
    FOURTEEN("Ace");

    public String cardName;

    CardNumber(String cardName) {
        this.cardName = cardName;
    }

    public String toString() {
        return this.cardName;
    }

}
