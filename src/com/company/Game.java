package com.company;

import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players = new ArrayList<Player>();
    private int numRounds;
    private int numDice;
//    private Player winner;
    //TODO: Modify winner to include multiple winners

    public Game(int numOfPlayers, int numRounds, int numDice) {
        this.numRounds = numRounds;
        this.numDice = numDice;
        generatePlayers(numOfPlayers);
        startGame();
    }

    private void playerTurn(Player player) {
        int sum = 0;

        for (Die die: player.rollHand()) {
            die.rollDie();
            sum += die.getValue();
            System.out.println(player.getName() + " rolled " + die.getValue());
        }
        int newScore = sum + player.getScore();
        player.setScore(sum);
        System.out.println(player.getName() + "'s total score is: " + sum);
    }

    public void startGame() {

        // Iterates through each Player object in the players Array List
        for (Player player : players) {
            playerTurn(player);
        }
    }

    private void generatePlayers(int numPlayers) {
        for (int i = 0; i < numPlayers ; i++) {
            String name = CLI.getString("Enter your name\nName: ");
            Player newPlayer = new Player(name, 0);
            players.add(newPlayer);
            Hand hand = new Hand();
            hand.setDice(generateDice());
            newPlayer.setHand(hand);
        }
    }

    private ArrayList<Die> generateDice() {
        ArrayList<Die> tempArr = new ArrayList<Die>();

        for (int i = 0; i < numDice; i++) {
            Die newDie = new Die(6);
            tempArr.add(newDie);
        }
        return tempArr;
    }
}
