package homework9;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Scanner scanner;
    private Random random = new Random();

    public Game(Scanner scanner) {
        this.scanner = scanner;
    }

    public void play() {
        Player user = new Player("You");
        Player computer = new Player("Computer");
        Steps[] steps = Steps.values();

        System.out.println("Make a choice! (rock/paper/scissors)");
        user.setChoice(scanner.nextLine().toLowerCase());

        if (!(user.getChoice().equals("rock") || user.getChoice().equals("paper")
                || user.getChoice().equals("scissors"))) {
            throw new IllegalArgumentException();
        }

        int randomNumber = random.nextInt(steps.length);
        computer.setChoice(steps[randomNumber].toString().toLowerCase());

        System.out.println("Your choice: " + user.getChoice());
        System.out.println("Computer's choice: " + computer.getChoice());

        whowins(user, computer);

        if (user.hasWon()) {
            System.out.println(user.getName() + " wins!");
        }
        else if (computer.hasWon()) {
            System.out.println(computer.getName() + " wins!");
        }
        else {
            System.out.println("It's a tie!");
        }
    }

    private void whowins(Player user, Player computer) {
        if (user.getChoice().equals(computer.getChoice())) {
        }
        else if (userWins(user.getChoice(), computer.getChoice())) {
            user.setWin(true);
        }
        else {
            computer.setWin(true);
        }
    }

    private boolean userWins(String userChoice, String computerChoice) {
        return (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"));
    }

}
