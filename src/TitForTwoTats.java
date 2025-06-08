public class TitForTwoTats extends GameStrategy {
    private boolean lastOpponentMove = true;
    private boolean secondLastOpponentMove = true; 

    public TitForTwoTats() {
        super("TitForTwoTats");
    }

    @Override
    public boolean makeMove(Boolean opponentLastMove) {
        if (opponentLastMove == null) {
            lastOpponentMove = true;
            secondLastOpponentMove = true;
            return true; 
        }

        secondLastOpponentMove = lastOpponentMove;
        lastOpponentMove = opponentLastMove;

        if (!lastOpponentMove && !secondLastOpponentMove) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void reset() {
        lastOpponentMove = true;
        secondLastOpponentMove = true;
    }
}