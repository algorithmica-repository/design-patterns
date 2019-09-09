package com.design.snakeladders.solution1.view;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.design.snakeladders.solution1.model.Game;

public class GUI extends JPanel {
    private Game game;
    private GameView gameView;
    private JButton moveButton;
    private JLabel dieValue;
    private JFrame frame;

    public GUI(Game game, String boardImagePath, int numRows, int numCols) throws IOException {
        this.game = game;

        setLayout(new BorderLayout());

        gameView = new GameView(game, boardImagePath, numRows, numCols);
        add(gameView, BorderLayout.CENTER);

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        add(rightPanel, BorderLayout.LINE_END);

        moveButton = new JButton("Move");
        rightPanel.add(moveButton);

        dieValue = new JLabel("");
        rightPanel.add(dieValue);
        
        frame = new JFrame("Snakes and Ladders");
        frame.setSize(700, 600);
        frame.setLayout(new BorderLayout());
        frame.add(this, BorderLayout.CENTER);
    }

    @Override
    protected void paintComponent(Graphics g) {
        dieValue.setText("Die: " + game.dieValue());
        super.paintComponent(g);
    }


    public void addActionListener(ActionListener listener) {
        moveButton.addActionListener(listener);
    }
    
    public void start() {
        frame.setVisible(true);
    }
}
