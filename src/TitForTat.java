public class TitForTat extends GameStrategy {
    public TitForTat() {
        super("TitForTat");
    }

    @Override
    public boolean makeMove(Boolean opponentLastMove) {
        if (opponentLastMove == null) {
            return true; 
        }
        return opponentLastMove; 
    }

    @Override
    public void reset() {
    }
}