package ui;

import game.GameState;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class InputHandler extends KeyAdapter {
    private GameState state;
    private GridPanel panel;

    public InputHandler(GameState state, GridPanel panel) {
        this.state = state;
        this.panel = panel;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (state.isGameOver()) return;

        int code = e.getKeyCode();
        System.out.println("Key Pressed: " + code);

        // Player 1 Controls (WASD + Q to Trap)
        switch (code) {
            case KeyEvent.VK_W: state.movePlayer(1, 0, -1); break;
            case KeyEvent.VK_S: state.movePlayer(1, 0, 1); break;
            case KeyEvent.VK_A: state.movePlayer(1, -1, 0); break;
            case KeyEvent.VK_D: state.movePlayer(1, 1, 0); break;
            case KeyEvent.VK_Q: state.playerAction(1); break;
        }

        // Player 2 Controls (Arrows + Space/Enter? Let's use M to Trap)
        switch (code) {
            case KeyEvent.VK_UP:    state.movePlayer(2, 0, -1); break;
            case KeyEvent.VK_DOWN:  state.movePlayer(2, 0, 1); break;
            case KeyEvent.VK_LEFT:  state.movePlayer(2, -1, 0); break;
            case KeyEvent.VK_RIGHT: state.movePlayer(2, 1, 0); break;
            case KeyEvent.VK_M:     state.playerAction(2); break;
        }

        panel.repaint();
    }
}
