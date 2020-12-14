package com.java.snakeladder;

import java.util.Random;

public class SnakeLadder {
    public static int playerOnePosition = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder game");
        Random random = new Random();
        do {
            int diceRoll = random.nextInt(7);
            int option = random.nextInt(3);
            System.out.println("Dice Roll is : "+diceRoll);
            switch (option) {
                case 0:
                    System.out.println("No Play");
                    break;
                case 1:
                    System.out.println("Ladder");
                    playerOnePosition += diceRoll;
                    break;
                case 2:
                    System.out.println("Snake");
                    playerOnePosition -= diceRoll;
                    break;
                default:
                    System.out.println("-----");
            }
            if (playerOnePosition < 0)
                playerOnePosition = 0;
            System.out.println("Player one Position --> " +playerOnePosition);
        }while (playerOnePosition <= 100);
    }
}
