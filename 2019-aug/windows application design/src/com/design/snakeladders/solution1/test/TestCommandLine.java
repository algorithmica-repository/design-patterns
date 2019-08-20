package com.design.snakeladders.solution1.test;

import java.util.List;

import com.design.snakeladders.solution1.model.Game;
import com.design.snakeladders.solution1.model.Player;

public class TestCommandLine {

    public static void display(Game game) {
        String result = "Die: " + game.dieValue() + "\n";

        List<Player> players = game.getPlayers();
        for (Player player: players) {
            result += player.toString() + "\n";
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Game game = new Game(2);

        display(game);
        while (!game.isFinished()) {
            game.move();
            display(game);
        }
        System.out.println("FIN");
        System.out.println("Winner:" + game.getWinner());
    }
}
