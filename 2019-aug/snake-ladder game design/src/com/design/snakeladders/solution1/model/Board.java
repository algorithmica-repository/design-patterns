package com.design.snakeladders.solution1.model;

public class Board {
    private Cell firstCell;
    private Cell lastCell;

    public Board(int numCells) {
        if (numCells < 1) {
            throw new IllegalArgumentException();
        }

        firstCell = new Cell(0);
        lastCell = firstCell;

        for (int i = 1; i < numCells; i++) {
            Cell cell = new Cell(i);
            lastCell.setNext(cell);
            lastCell = cell;
        }
    }

    public void setTransporter(int fromIndex, int toIndex) {
        Cell source = getCell(fromIndex);
        Cell destination = getCell(toIndex);
        source.setTransport(destination);
    }

    private Cell getCell(int n) {
        Cell cell = firstCell;
        for (int i = 0; i < n; i++) {
            cell = cell.getNext();
        }
        return cell;
    }

    public Cell getFirstCell() {
        return firstCell;
    }

    public Cell getLastCell() {
        return lastCell;
    }

    public int getNumCells() {
        return lastCell.getIndex() + 1;
    }
}
