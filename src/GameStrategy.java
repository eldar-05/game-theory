public abstract class GameStrategy {
    protected String name;

    public GameStrategy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract boolean makeMove(Boolean opponentLastMove);
    public abstract void reset();
}