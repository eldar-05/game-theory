public class Grudger extends GameStrategy {
    private boolean betrayed = false;

    public Grudger() {
        super("Grudger");
    }

    @Override
    public boolean makeMove(Boolean opponentLastMove) {
        if (betrayed) {
            return false; 
        }
        if (opponentLastMove != null && !opponentLastMove) {
            betrayed = true;
            return false; 
        }
        return true;
    }

    @Override
    public void reset() {
        betrayed = false;
    }
}