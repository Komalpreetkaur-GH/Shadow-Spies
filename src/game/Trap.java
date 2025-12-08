package game;

public class Trap {
    private int ownerId; // 1 or 2
    private boolean active;

    public Trap(int ownerId) {
        this.ownerId = ownerId;
        this.active = true;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public boolean isActive() {
        return active;
    }

    public void deactivate() {
        this.active = false;
    }
}
