package game;

public class Item {
    public enum Type {
        SECRET_DATA,
        EXIT
    }

    private Type type;

    public Item(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}
