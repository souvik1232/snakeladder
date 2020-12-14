package com.java.snakeladder;

public class SnakeLadderMethod {
    Player player1 = new Player();
    Player player2 = new Player();
    public void init(){
        player1.setPlayerTurn(1);
    }
    public void noPlay(){
        if (player1.getPlayerTurn()==1)
            player1.setDiceCount(player1.getDiceCount()+1);
        else
            player2.setDiceCount(player2.getDiceCount()+1);
        int temp = player1.getPlayerTurn();
        player1.setPlayerTurn(player2.getPlayerTurn());
        player2.setPlayerTurn(temp);
        System.out.println("Position of player one ---> "+player1.getPlayerPosition());
        System.out.println("Position of player two ---> "+player2.getPlayerPosition());
        System.out.println("Dice count ---> "+ (player1.getDiceCount()+player2.getDiceCount()));
    }
    public int ladder(int roll){
        if (player1.getPlayerTurn() == 1) {
            System.out.println("Player 1 turn");
            player1.setPlayerPosition(player1.getPlayerPosition() + roll);
            player1.setDiceCount(player1.getDiceCount()+1);
            if (player1.getPlayerPosition()>10)
                player1.setPlayerPosition(player1.getPlayerPosition() - roll);

        }
        else {
            System.out.println("Player 2 turn");
            player2.setPlayerPosition(player2.getPlayerPosition() + roll);
            player2.setDiceCount(player2.getDiceCount()+1);
            if (player2.getPlayerPosition()>10)
                player2.setPlayerPosition(player2.getPlayerPosition() - roll);
        }
        System.out.println("Position of player one ---> "+player1.getPlayerPosition());
        System.out.println("Position of player two ---> "+player2.getPlayerPosition());
        System.out.println("Dice count ---> "+ (player1.getDiceCount()+player2.getDiceCount()));
        if (player1.getPlayerPosition()==10)
            return 1;
        else if(player2.getPlayerPosition()==10)
            return 2;
            return 0;
    }
    public void snake(int roll){
        if (player1.getPlayerTurn() == 1) {
            System.out.println("Player 1 turn");
            player1.setPlayerPosition(player1.getPlayerPosition() - roll);
            player1.setDiceCount(player1.getDiceCount()+1);
            if(player1.getPlayerPosition()<0)
                player1.setPlayerPosition(0);
        }
        else {
            System.out.println("Player 2 turn");
            player2.setPlayerPosition(player2.getPlayerPosition() - roll);
            player2.setDiceCount(player2.getDiceCount()+1);
            if(player2.getPlayerPosition()<0)
                player2.setPlayerPosition(0);
        }
        System.out.println("Position of player one ---> "+player1.getPlayerPosition());
        System.out.println("Position of player two ---> "+player2.getPlayerPosition());
        System.out.println("Dice count ---> "+ (player1.getDiceCount()+player2.getDiceCount()));
        int temp = player1.getPlayerTurn();
        player1.setPlayerTurn(player2.getPlayerTurn());
        player2.setPlayerTurn(temp);
    }
}
