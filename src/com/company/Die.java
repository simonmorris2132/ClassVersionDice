package com.company;

public class Die {

    private int sides;
    private int value;

    public Die(int sides) {
        this.sides = sides;
    }
    public void rollDie() {
        value = (int) (Math.random() * sides + 1);
    }

    public int getValue() {
        return value;
    }
}
