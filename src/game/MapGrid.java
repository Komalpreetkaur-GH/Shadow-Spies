package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MapGrid {
    private int width;
    private int height;
    private Trap[][] trapGrid;
    private Item[][] itemGrid;
    
    public MapGrid(int width, int height) {
        this.width = width;
        this.height = height;
        this.trapGrid = new Trap[width][height];
        this.itemGrid = new Item[width][height];
    }

    public void placeItem(int x, int y, Item item) {
        if (isValid(x, y)) {
            itemGrid[x][y] = item;
        }
    }

    public Item getItem(int x, int y) {
        if (isValid(x, y)) {
            return itemGrid[x][y];
        }
        return null;
    }
    
    public void removeItem(int x, int y) {
         if (isValid(x, y)) {
            itemGrid[x][y] = null;
        }
    }

    public boolean placeTrap(int x, int y, Trap trap) {
        if (isValid(x, y) && trapGrid[x][y] == null) {
            trapGrid[x][y] = trap;
            return true;
        }
        return false;
    }

    public Trap getTrap(int x, int y) {
        if (isValid(x, y)) {
            return trapGrid[x][y];
        }
        return null;
    }
    
    public void removeTrap(int x, int y) {
        if (isValid(x, y)) {
            trapGrid[x][y] = null;
        }
    }

    public boolean isValid(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }

    public int getWidth() { return width; }
    public int getHeight() { return height; }
}
