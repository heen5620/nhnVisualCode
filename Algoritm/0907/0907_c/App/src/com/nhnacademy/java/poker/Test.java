package com.nhnacademy.java.poker;

public class Test {
    public static void main(String[] args) {
        Table table = new Table();

        User user1 = new User("user1");
        User user2 = new User("user2");

        table.addUser(user1);
        table.addUser(user2);

        table.startGame();
    }
}
