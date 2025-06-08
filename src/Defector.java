public class Defector extends GameStrategy {
    public Defector() {
        super("Defector");
    }

    @Override
    public boolean makeMove(Boolean opponentLastMove) {
        return false; 
    }

    @Override
    public void reset() {
    }
}