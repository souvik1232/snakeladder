package com.java.snakeladder;

import java.util.Random;

public class SnakeLadder {


    public static void main(String[] args) {
        SnakeLadderMethod snakeLadderMethod = new SnakeLadderMethod();
        System.out.println("Welcome to Snake and Ladder game");
        Random random = new Random();
        int winner = 0;
        snakeLadderMethod.init();
        do {
            int diceRoll = random.nextInt(7);
            int option = random.nextInt(3);
            System.out.println("Dice Roll is : "+diceRoll);
            switch (option) {
                case 0:
                    System.out.println("No Play");
                    snakeLadderMethod.noPlay();
                    break;
                case 1:
                    System.out.println("Ladder");
                    winner=snakeLadderMethod.ladder(diceRoll);
                    break;
                case 2:
                    System.out.println("Snake");
                    snakeLadderMethod.snake(diceRoll);
                    break;
                default:
                    System.out.println("-----");
            }

        }while (winner == 0);
        System.out.println("The winner is : player "+winner);
    }
}
