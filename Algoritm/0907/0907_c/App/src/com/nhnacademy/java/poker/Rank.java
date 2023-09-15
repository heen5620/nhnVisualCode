package com.nhnacademy.java.poker;

/*
 * 카드 등급 관리하는 클래스.
 * 
 * one pair, two pair등급 관리.
 * 원페어 - 무늬 관계 없이 같은 숫자 두장
 * 투페어 - 같은 숫자 두개 3 3 5 5 이런식으로...
 */

import java.util.*;

public class Rank {
    private ArrayList<Card> cards;

    public Rank(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public boolean onePair() {
        int[] counts = new int[15];

        for (Card card : cards) {
            counts[card.cardNumber.getNumberValue()]++;
        }

        int pairCount = 0;

        for (int count : counts) {
            if (count == 2)
                pairCount++;
        }

        return pairCount == 1;
    }

    public boolean twoPair() {
        int[] counts = new int[15];

        for (Card card : cards) {
            counts[card.cardNumber.getNumberValue()]++;
        }

        int pairCount = 0;

        for (int count : counts) {
            if (count == 2)
                pairCount++;
        }

        return pairCount == 2;
    }

    // 둘 다 원페어, 혹은 투페어 인 경우... -> 모양의 랭크 순서가 가장 높은것을 가진 user가 승,
    // 혹은 무늬가 같다면, 숫자...cardNumber가 가장 높은 것을 가진사람이 승리
}
