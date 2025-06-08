import java.util.Random;

public class RandomStrategy extends GameStrategy {
    private Random random;

    public RandomStrategy() {
        super("Random");
        this.random = new Random();
    }

    @Override
    public boolean makeMove(Boolean opponentLastMove) {
        return random.nextBoolean(); 
    }

    @Override
    public void reset() {
    }
}