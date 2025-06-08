import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrisonerDilemma game = new PrisonerDilemma();

        Map<Integer, GameStrategy> availableStrategies = new HashMap<>();
        List<GameStrategy> strategyList = new ArrayList<>();

        //доступные стратегии
        strategyList.add(new Cooperator());
        strategyList.add(new Defector());
        strategyList.add(new TitForTat());
        strategyList.add(new Grudger());
        strategyList.add(new Prober());
        strategyList.add(new RandomStrategy());
        strategyList.add(new Pavlov());
        strategyList.add(new SoftMajority());
        strategyList.add(new HardMajority());
        strategyList.add(new TitForTwoTats());

        for (int i = 0; i < strategyList.size(); i++) {
            availableStrategies.put(i + 1, strategyList.get(i));
        }

        while (true) {
            System.out.println("Выберите две стратегии для симуляции:");
            System.out.println("------------------------------------");
            for (Map.Entry<Integer, GameStrategy> entry : availableStrategies.entrySet()) {
                System.out.println(entry.getKey() + ". " + entry.getValue().getName());
            }
            System.out.println("------------------------------------");

            GameStrategy strategy1 = null;
            GameStrategy strategy2 = null;
            int rounds = 0;

            try {
                System.out.print("Введите номер первой стратегии: ");
                int choice1 = scanner.nextInt();
                strategy1 = availableStrategies.get(choice1);
                if (strategy1 == null) {
                    System.out.println("Неверный выбор стратегии. Попробуйте снова.");
                    continue;
                }

                System.out.print("Введите номер второй стратегии: ");
                int choice2 = scanner.nextInt();
                strategy2 = availableStrategies.get(choice2);
                if (strategy2 == null) {
                    System.out.println("Неверный выбор стратегии. Попробуйте снова.");
                    continue;
                }

                if (choice1 == choice2) {
                    System.out.println("Пожалуйста, выберите две РАЗНЫЕ стратегии.");
                    continue;
                }

                System.out.print("Введите количество раундов: ");
                rounds = scanner.nextInt();
                if (rounds <= 0) {
                    System.out.println("Количество раундов должно быть положительным числом.");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Неверный ввод. Пожалуйста, введите число.");
                scanner.next();
                continue;
            }

            game.simulateGame(strategy1, strategy2, rounds);

            System.out.print("Хотите сыграть еще? (да/нет): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("да")) {
                break;
            }
        }

        scanner.close();
        System.out.println("Спасибо за игру!");
    }
}