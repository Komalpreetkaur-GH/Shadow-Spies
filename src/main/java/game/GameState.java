package game;

import java.util.Random;

public class GameState {
    private MapGrid grid;
    private Player p1;
    private Player p2;
    private boolean isGameOver;
    private String winnerMessage;

    public GameState() {
        // Initialize Grid
        grid = new MapGrid(15, 15);
        
        // Initialize Players
        p1 = new Player(1, 1, 1);
        p2 = new Player(2, 13, 13);
        
        // Place Items
        placeRandomItems();
        
        isGameOver = false;
        winnerMessage = "";
    }
    
    private void placeRandomItems() {
        // Place Secret Data
        Random rand = new Random();
        int dataX, dataY;
        do {
            dataX = rand.nextInt(15);
            dataY = rand.nextInt(15);
        } while ((Math.abs(dataX - p1.getX()) < 3 && Math.abs(dataY - p1.getY()) < 3) || 
                 (Math.abs(dataX - p2.getX()) < 3 && Math.abs(dataY - p2.getY()) < 3)); 
        // Avoid spawning too close to players
        
        grid.placeItem(dataX, dataY, new Item(Item.Type.SECRET_DATA));
        
        // Place Exit (optional: maybe exit is fixed or random?)
        // Let's make the center the exit for MVP
        grid.placeItem(7, 7, new Item(Item.Type.EXIT));
    }

    public void movePlayer(int playerId, int dx, int dy) {
        if (isGameOver) return;

        Player p = (playerId == 1) ? p1 : p2;
        p.move(dx, dy, grid.getWidth(), grid.getHeight());
        
        checkInteractions(p);
    }
    
    public void playerAction(int playerId) {
        if (isGameOver) return;
        Player p = (playerId == 1) ? p1 : p2;
        
        // Try to place trap
        if (grid.getTrap(p.getX(), p.getY()) == null && p.useTrap()) {
             grid.placeTrap(p.getX(), p.getY(), new Trap(playerId));
             System.out.println("Player " + playerId + " placed a trap.");
        }
    }

    private void checkInteractions(Player p) {
        int x = p.getX();
        int y = p.getY();
        
        // Check Items
        Item item = grid.getItem(x, y);
        if (item != null) {
            if (item.getType() == Item.Type.SECRET_DATA && !p.hasData()) {
                p.setHasData(true);
                p.addScore(1);
                grid.removeItem(x, y);
                System.out.println("Player " + p.getId() + " found the DATA!");
            } else if (item.getType() == Item.Type.EXIT && p.hasData()) {
                isGameOver = true;
                winnerMessage = "Player " + p.getId() + " Wins!";
            }
        }
        
        // Check Traps
        Trap trap = grid.getTrap(x, y);
        if (trap != null && trap.isActive() && trap.getOwnerId() != p.getId()) {
            // Trigger trap!
            System.out.println("Player " + p.getId() + " triggered a trap!");
            trap.deactivate();
            grid.removeTrap(x, y); // Remove after trigger
            
            // Penalties? For MVP: Opponent gets point.
            Player opponent = (p.getId() == 1) ? p2 : p1;
            opponent.addScore(1);
            
            // Maybe stun or teleport? MVP: just points for now.
        }
    }

    public MapGrid getGrid() { return grid; }
    public Player getP1() { return p1; }
    public Player getP2() { return p2; }
    public boolean isGameOver() { return isGameOver; }
    public String getWinnerMessage() { return winnerMessage; }
}
