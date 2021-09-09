package com.company;

import java.util.ArrayList;

public class Hand {

    public ArrayList<Die> dice;

    public Hand(ArrayList<Die> dice) {
        this.dice = dice;
    }

    public void rollDie() {
        for (int i = 0; i < dice.size(); i++) {
            dice.get(i).rollDie();
        }
    }

    public void setDice(ArrayList<Die> generateDie) {
    }
}
