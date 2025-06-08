public class PrisonerDilemma {
    private static final int R = 3; 
    private static final int S = 0; 
    private static final int T = 5; 
    private static final int P = 1; 

    public void simulateGame(GameStrategy strategy1, GameStrategy strategy2, int rounds) {
        int score1 = 0;
        int score2 = 0;

        strategy1.reset();
        strategy2.reset();

        Boolean lastMove1 = null; 
        Boolean lastMove2 = null; 

        System.out.println("--- Начинается симуляция: " + strategy1.getName() + " vs " + strategy2.getName() + " ---");
        System.out.println("Раунд\t" + strategy1.getName() + "\t" + strategy2.getName() + "\tОчки " + strategy1.getName() + "\tОчки " + strategy2.getName());

        for (int i = 1; i <= rounds; i++) {
            boolean move1 = strategy1.makeMove(lastMove2);
            boolean move2 = strategy2.makeMove(lastMove1);

            int roundScore1 = 0;
            int roundScore2 = 0;

            if (move1 && move2) { 
                roundScore1 = R;
                roundScore2 = R;
            } else if (move1 && !move2) { 
                roundScore1 = S;
                roundScore2 = T;
            } else if (!move1 && move2) { 
                roundScore1 = T;
                roundScore2 = S;
            } else { 
                roundScore1 = P;
                roundScore2 = P;
            }

            score1 += roundScore1;
            score2 += roundScore2;

            System.out.printf("%d\t%s\t\t%s\t\t%d\t\t%d\n", i,
                              move1 ? "C" : "D",
                              move2 ? "C" : "D",
                              roundScore1,
                              roundScore2);

            lastMove1 = move1;
            lastMove2 = move2;
        }

        System.out.println("\n--- Результаты симуляции ---");
        System.out.println(strategy1.getName() + " итоговые очки: " + score1);
        System.out.println(strategy2.getName() + " итоговые очки: " + score2);

        if (score1 > score2) {
            System.out.println(strategy1.getName() + " победил!");
        } else if (score2 > score1) {
            System.out.println(strategy2.getName() + " победил!");
        } else {
            System.out.println("Ничья!");
        }
        System.out.println("---------------------------\n");
    }
}