package com.design.snakeladders.solution1.model;

public class Die {
    private static final int NUM_FACES = 6;
    private int face;

    public Die() {
        roll();
    }

    public void roll() {
        face = (int)(Math.random() * NUM_FACES) + 1;
    }

    public int getFace() {
        return face;
    }
}
