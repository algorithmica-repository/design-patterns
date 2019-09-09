package com.design.snakeladders.solution1.model;

public class Cell {
    private int index;
    private Cell next;
    private Cell transport;

    public Cell(int index) {
        this.index = index;
    }

    public Cell getTransport() {
        if (transport == null)
            return this;
        else
            return transport;
    }

    public void setTransport(Cell transport) {
        this.transport = transport;
    }

    public Cell getNext() {
        return next;
    }

    public void setNext(Cell next) {
        this.next = next;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return "Cell(" + (index + 1) + ")";
    }
}
