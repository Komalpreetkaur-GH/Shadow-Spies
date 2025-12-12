package game;

import ui.GameWindow;
import javax.swing.SwingUtilities;

public class Game {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create game state
            GameState state = new GameState();
            
            // Create and show window
            GameWindow window = new GameWindow(state);
            window.setVisible(true);
        });
    }
}
