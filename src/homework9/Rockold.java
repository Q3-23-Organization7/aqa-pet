package homework9;

import java.util.Scanner;
import java.util.Random;

public class Rockold {
    public static void main(String[] args) {
        // Getting input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Make a move! (rock/paper/scissors)");
        String playerMove = scanner.nextLine();

        // Getting input from the computer
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        String computerMove;
        if (randomNumber == 0) {
            computerMove = "rock";
        } else if (randomNumber == 1) {
            computerMove = "paper";
        } else {
            computerMove = "scissors";
        }
        System.out.println("Computer chose " + computerMove + "!");



    }
}
