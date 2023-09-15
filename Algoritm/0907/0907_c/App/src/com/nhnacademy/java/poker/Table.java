package com.nhnacademy.java.poker;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private Deck deck;
    private List<User> users;

    public Table() {
        this.deck = new Deck();
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void startGame() {
        deck.shuffle();

        for (User User : users) {
            List<Card> hand = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                hand.add(deck.getCard());
            }
            User.setHand(hand);

            System.out.print(User.getName() + " : ");
            for (Card card : hand) {
                System.out.print(card);
            }
            System.out.println();
        }

        User winner = compareHands(users.get(0), users.get(1));
        String name_winner = winner.getName();
        System.out.println(name_winner + " 승리!");

    }

    private User compareHands(User user1, User user2) {
        Rank rankuser1 = new Rank(new ArrayList<>(user1.getHand()));
        boolean user1OnePair = rankuser1.onePair();
        boolean user1TwoPair = rankuser1.twoPair();

        Rank rankuser2 = new Rank(new ArrayList<>(user2.getHand()));
        boolean user2OnePair = rankuser2.onePair();
        boolean user2TwoPair = rankuser2.twoPair();

        if (user1OnePair) {
            System.out.println("user 1: One Pair");
            if (!user2OnePair)
                return user1;
        } else if (user1TwoPair) {
            System.out.println("user 1: Two Pair");
            if (!user2TwoPair)
                return user1;
        }

        if (user2OnePair) {
            System.out.println("user 2: One Pair");
            if (!user1OnePair)
                return user2;
        } else if (user2TwoPair) {
            System.out.println("user 2: Two Pair");
            if (!user1TwoPair)
                return user2;
        }

        if (user1OnePair && user2OnePair || user1TwoPair && user2TwoPair) {
            int user1HighestCard = 0;
            for (Card c : user1.getHand()) {
                if (c.cardNumber.getNumberValue() > user1HighestCard) {
                    user1HighestCard = c.cardNumber.getNumberValue();
                }
            }

            int player2HighestCard = 0;
            for (Card c : user2.getHand()) {
                if (c.cardNumber.getNumberValue() > player2HighestCard) {
                    player2HighestCard = c.cardNumber.getNumberValue();
                }
            }

            if (user1HighestCard > player2HighestCard) {
                return user1;
            } else if (player2HighestCard > user1HighestCard) {
                return user2;
            } else {
                System.out.println("이긴사람이 없습니다!");
                return null;
            }
        }
        throw new IllegalStateException("이긴 사람이 없습니다");

    }

}
