package com.java.snakeladder;

import java.util.Random;

public class SnakeLadder {
    int playerOnePosition = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder game");
        Random random = new Random();
        int diceRoll = random.nextInt(7);
        System.out.println(diceRoll);
    }
}
