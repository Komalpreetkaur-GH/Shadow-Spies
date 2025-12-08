package game;

public class Player {
    private int id;
    private int x, y;
    private boolean hasData;
    private int score;
    private int trapsRemaining;

    public Player(int id, int startX, int startY) {
        this.id = id;
        this.x = startX;
        this.y = startY;
        this.hasData = false;
        this.score = 0;
        this.trapsRemaining = 3; // Give initial traps
    }

    public void move(int dx, int dy, int maxX, int maxY) {
        int newX = x + dx;
        int newY = y + dy;
        if (newX >= 0 && newX < maxX && newY >= 0 && newY < maxY) {
            this.x = newX;
            this.y = newY;
        }
    }

    public void addScore(int points) {
        this.score += points;
    }

    public boolean useTrap() {
        if (trapsRemaining > 0) {
            trapsRemaining--;
            return true;
        }
        return false;
    }

    public int getId() { return id; }
    public int getX() { return x; }
    public int getY() { return y; }
    public boolean hasData() { return hasData; }
    public void setHasData(boolean hasData) { this.hasData = hasData; }
    public int getScore() { return score; }
    public int getTrapsRemaining() { return trapsRemaining; }
}
