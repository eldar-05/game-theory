import java.util.Random;

public class Prober extends GameStrategy {
    private boolean tryingToExploit = false;
    private boolean lastMoveWasDefect = false;

    public Prober() {
        super("Prober");
    }

    @Override
    public boolean makeMove(Boolean opponentLastMove) {
        if (opponentLastMove == null) {
            tryingToExploit = false; 
            lastMoveWasDefect = false;
            return true; 
        }

        if (tryingToExploit) {
            if (lastMoveWasDefect && opponentLastMove) {
                return false;
            } else if (lastMoveWasDefect && !opponentLastMove) {
                tryingToExploit = false;
                return opponentLastMove;
            } else {
                return opponentLastMove;
            }
        }
        if (new Random().nextDouble() < 0.1 && !lastMoveWasDefect) { 
            tryingToExploit = true;
            lastMoveWasDefect = true;
            return false;
        } else {
            lastMoveWasDefect = false;
            return opponentLastMove;
        }
    }

    @Override
    public void reset() {
        tryingToExploit = false;
        lastMoveWasDefect = false;
    }
}