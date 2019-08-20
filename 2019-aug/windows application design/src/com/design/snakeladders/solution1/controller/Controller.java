package com.design.snakeladders.solution1.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.design.snakeladders.solution1.model.Game;
import com.design.snakeladders.solution1.view.GUI;

public class Controller implements ActionListener {
    private Game game;
    private GUI gui;

    public Controller(Game game, GUI gui) {
        this.game = game;
        this.gui = gui;
        gui.addActionListener(this);
    }
    
    public void start() {
    	gui.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        game.move();
        gui.repaint();
        if (game.isFinished()) {
            JOptionPane.showMessageDialog(null, "We have a winner!");
            System.exit(0);
        }
    }
}
