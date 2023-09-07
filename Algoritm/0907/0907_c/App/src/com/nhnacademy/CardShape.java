package com.nhnacademy;

public enum CardShape {
    CLO("Clover"),
    HRT("Heart"),
    SPD("Spade"),
    DIA("Diamond");

    public String cardShpe;

    CardShape(String cardShape) {
        this.cardShpe = cardShape;
    }

    public String toString() {
        return this.cardShpe;
    }
}
