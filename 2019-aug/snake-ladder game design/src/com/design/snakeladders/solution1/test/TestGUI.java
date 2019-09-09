package com.design.snakeladders.solution1.test;

import java.io.IOException;

import com.design.snakeladders.solution1.controller.Controller;
import com.design.snakeladders.solution1.model.Game;
import com.design.snakeladders.solution1.view.GUI;

public class TestGUI {
	
    public static void main(String[] args) throws IOException {
        Game game = new Game(2);
        GUI gui = new GUI(game, "E:/game-design/board6x6.jpg", 6, 6);
        Controller controller = new Controller(game, gui);
        controller.start();
    }
    
}
