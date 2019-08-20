package com.design.snakeladders.solution1.model;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Die die;
    private Board board;
    private List<Player> players;
    private int currentPlayerIndex;

    public Game(int numPlayers) {
        this.die = new Die();
        this.board = BoardBuilder.get6x6Board();
        this.players = new ArrayList<Player>(numPlayers);
        for (int i = 0; i < numPlayers; i++) {
            Player player = new Player(i);
            players.add(player);
            player.setCell(board.getFirstCell());
        }
        this.currentPlayerIndex = 0;
    }

    public void move() {
        die.roll();
        int numSteps = die.getFace();
        Player currentPlayer =  players.get(currentPlayerIndex);
        int targetIndex = currentPlayer.getCell().getIndex() + numSteps;
        int lastIndex = board.getLastCell().getIndex();
        if (targetIndex <= lastIndex) {
            currentPlayer.move(numSteps);
        }
        currentPlayerIndex = (++currentPlayerIndex) % players.size();
    }

    public boolean isFinished() {
        return getWinner() != null;
    }

    public Player getWinner() {
        for (Player player: getPlayers()) {
            if (player.getCell() == board.getLastCell())
                return player;
        }
        return null;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public int dieValue() {
        return die.getFace();
    }


}
