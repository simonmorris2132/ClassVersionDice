package com.company;

import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players = new ArrayList<>();
    private int numOfRounds;
    private int numOfDice;
    private Player winner;

    public Game(int numOfPlayers, int numOfRounds, int numOfDice) {
        this.numOfRounds = numOfRounds;
        this.numOfDice = numOfDice;
        generatePlayers(numOfPlayers);
    }

    public void startGame() {

    }

    public void playerTurn(Player player) {


    }

    public void printScore() {


    }

    private void generatePlayers(int numOfPlayers) {
        for (int i = 0; i < numOfPlayers; i++) {
            String name = CLI.getStr("What player name?\nName: ");
            Player newPlayer = new Player(name,0);
            newPlayer.setPlayerName(name);
        }

    }

    private ArrayList<Die> generateDie() {
        return null;

    }


}
