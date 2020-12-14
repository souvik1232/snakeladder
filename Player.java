package com.java.snakeladder;

public class Player {
    int diceCount;
    int playerPosition;
    int playerTurn;
    public  Player(){
        this.diceCount = 0;
        this.playerPosition = 0;
        this.playerTurn = 0;
    }

    public int getDiceCount() {
        return diceCount;
    }

    public void setDiceCount(int diceCount) {
        this.diceCount = diceCount;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }

    public int getPlayerTurn() {
        return playerTurn;
    }

    public void setPlayerTurn(int playerTurn) {
        this.playerTurn = playerTurn;
    }
}
