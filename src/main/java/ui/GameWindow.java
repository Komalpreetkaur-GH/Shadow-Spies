package ui;

import game.GameState;
import javax.swing.*;

public class GameWindow extends JFrame {
    
    public GameWindow(GameState state) {
        setTitle("Spy vs Spy - MVP");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        GridPanel gridPanel = new GridPanel(state);
        gridPanel.setFocusable(true);
        add(gridPanel);
        
        InputHandler inputHandler = new InputHandler(state, gridPanel);
        gridPanel.addKeyListener(inputHandler);
        
        pack();
        // Adjust size for score area at bottom
        setSize(getWidth(), getHeight() + 40);
        setLocationRelativeTo(null);
        
        gridPanel.requestFocusInWindow();
    }
}
