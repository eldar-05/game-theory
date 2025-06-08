public class Pavlov extends GameStrategy {
    private boolean lastOwnMove = true;

    public Pavlov() {
        super("Pavlov");
    }

    @Override
    public boolean makeMove(Boolean opponentLastMove) {
        if (opponentLastMove == null) {
            lastOwnMove = true;
            return true;
        }
        if (lastOwnMove == opponentLastMove) {
            return lastOwnMove;
        } else {
            lastOwnMove = !lastOwnMove;
            return lastOwnMove;
        }
    }

    @Override
    public void reset() {
        lastOwnMove = true;
    }
}