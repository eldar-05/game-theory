public class Cooperator extends GameStrategy {
    public Cooperator() {
        super("Cooperator");
    }

    @Override
    public boolean makeMove(Boolean opponentLastMove) {
        return true; 
    }

    @Override
    public void reset() {
    }
}