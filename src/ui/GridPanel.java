package ui;

import game.*;
import javax.swing.*;
import java.awt.*;

public class GridPanel extends JPanel {
    private GameState state;
    private final int CELL_SIZE = 40;

    // Blueprint Colors
    private final Color BLUEPRINT_BG = new Color(25, 25, 112); // Midnight Blue
    private final Color GRID_LINES = new Color(100, 149, 237, 50); // Cornflower Blue with Alpha
    private final Color FOG_COLOR = new Color(10, 10, 30); // Very Dark Blue/Black

    public GridPanel(GameState state) {
        this.state = state;
        int width = state.getGrid().getWidth() * CELL_SIZE;
        int height = state.getGrid().getHeight() * CELL_SIZE;
        setPreferredSize(new Dimension(width, height));
        setBackground(BLUEPRINT_BG);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        MapGrid grid = state.getGrid();
        Player p1 = state.getP1();
        Player p2 = state.getP2();

        int width = getWidth();
        int height = getHeight();

        // Draw Blueprint Grid
        g.setColor(BLUEPRINT_BG);
        g.fillRect(0, 0, width, height);
        
        // Draw Cells
        for (int x = 0; x < grid.getWidth(); x++) {
            for (int y = 0; y < grid.getHeight(); y++) {
                // Determine visibility
                boolean visibleP1 = Visibility.isVisible(p1.getX(), p1.getY(), x, y);
                boolean visibleP2 = Visibility.isVisible(p2.getX(), p2.getY(), x, y);
                boolean visible = visibleP1 || visibleP2;

                int px = x * CELL_SIZE;
                int py = y * CELL_SIZE;

                if (visible) {
                    // Open Cell
                    g.setColor(BLUEPRINT_BG);
                    g.fillRect(px, py, CELL_SIZE, CELL_SIZE);
                    g.setColor(GRID_LINES);
                    g.drawRect(px, py, CELL_SIZE, CELL_SIZE);

                    // Draw Items & Traps
                    drawContents(g2, x, y, px, py);

                } else {
                    // Fog
                    g.setColor(FOG_COLOR);
                    g.fillRect(px, py, CELL_SIZE, CELL_SIZE);
                    // Faint grid in fog? Maybe not.
                }
            }
        }

        // Draw Players
        drawSpy(g2, p1.getX(), p1.getY(), Color.WHITE, "P1");
        drawSpy(g2, p2.getX(), p2.getY(), Color.BLACK, "P2");
        
        // UI Overlay (Score)
        drawUI(g2);
    }

    private void drawContents(Graphics2D g, int x, int y, int px, int py) {
        MapGrid grid = state.getGrid();
        
        // Items
        Item item = grid.getItem(x, y);
        if (item != null) {
            if (item.getType() == Item.Type.SECRET_DATA) {
                // Briefcase
                g.setColor(new Color(139, 69, 19)); // Brown
                g.fillRect(px + 10, py + 12, 20, 16);
                g.setColor(Color.LIGHT_GRAY); // Handle
                g.setStroke(new BasicStroke(2));
                g.drawArc(px + 15, py + 8, 10, 10, 0, 180);
                g.setStroke(new BasicStroke(1));
            } else if (item.getType() == Item.Type.EXIT) {
                // Door / Exit
                g.setColor(Color.GREEN);
                g.setStroke(new BasicStroke(2));
                g.drawRect(px + 8, py + 5, 24, 30);
                g.drawString("EXIT", px + 5, py + 25);
            }
        }

        // Traps
        Trap trap = grid.getTrap(x, y);
        if (trap != null && trap.isActive()) {
            boolean isP1 = trap.getOwnerId() == 1;
            g.setColor(isP1 ? Color.RED : Color.CYAN);
            // Bomb icon
            g.fillOval(px + 12, py + 12, 16, 16);
            g.setColor(Color.WHITE);
            g.drawString("!", px + 17, py + 24);
            // Fuse
            g.setColor(Color.ORANGE);
            g.drawLine(px + 20, py + 12, px + 25, py + 8);
        }
    }

    private void drawSpy(Graphics2D g, int gridX, int gridY, Color color, String label) {
        int px = gridX * CELL_SIZE;
        int py = gridY * CELL_SIZE;

        // Hat / Spy Shape (Triangle-ish)
        int[] xPoints = {px + 20, px + 5, px + 35};
        int[] yPoints = {py + 5, py + 35, py + 35};
        
        g.setColor(color);
        g.fillPolygon(xPoints, yPoints, 3);
        
        // Outline for contrast (especially for Black spy)
        g.setColor(Color.GRAY);
        g.drawPolygon(xPoints, yPoints, 3);

        // Eyes (Sunglasses)
        g.setColor(Color.DARK_GRAY);
        g.fillRect(px + 15, py + 15, 10, 4);
    }
    
    private void drawUI(Graphics2D g) {
        Player p1 = state.getP1();
        Player p2 = state.getP2();
        
        g.setColor(Color.WHITE);
        g.setFont(new Font("Monospaced", Font.BOLD, 16));
        
        // Score Panel
        String s1 = "WHITE SPY: " + p1.getScore() + (p1.hasData() ? " [💼]" : "");
        String s2 = "BLACK SPY: " + p2.getScore() + (p2.hasData() ? " [💼]" : "");
        
        g.drawString(s1, 10, getHeight() - 10);
        g.drawString(s2, getWidth() - 200, getHeight() - 10);

        if (state.isGameOver()) {
            g.setColor(new Color(0, 0, 0, 200));
            g.fillRect(0, getHeight() / 2 - 40, getWidth(), 80);
            g.setColor(Color.YELLOW);
            g.setFont(new Font("Monospaced", Font.BOLD, 30));
            String msg = state.getWinnerMessage();
            int strWidth = g.getFontMetrics().stringWidth(msg);
            g.drawString(msg, getWidth() / 2 - strWidth / 2, getHeight() / 2 + 10);
        }
    }
}
