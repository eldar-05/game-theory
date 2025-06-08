public class SoftMajority extends GameStrategy {
    private int opponentCooperations;
    private int opponentDefections;

    public SoftMajority() {
        super("SoftMajority");
        reset();
    }

    @Override
    public boolean makeMove(Boolean opponentLastMove) {
        if (opponentLastMove == null) {
            reset();
            return true;
        }

        if (opponentLastMove) {
            opponentCooperations++;
        } else {
            opponentDefections++;
        }

        return opponentCooperations >= opponentDefections;
    }

    @Override
    public void reset() {
        opponentCooperations = 0;
        opponentDefections = 0;
    }
}