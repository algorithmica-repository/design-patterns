package com.design.snakeladders.solution1.model;

public class Player {
    private Cell cell;
    private int index;

    public Player(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public void move(int numSteps) {
        for (int i = 0; i < numSteps; i++) {
            cell = cell.getNext();
        }
        cell = cell.getTransport();
    }

    @Override
    public String toString() {
        return "Player " + index + " @ " + cell;
    }
}
