package homework9;


import java.util.Scanner;
public class Playthegame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Game game = new Game(scanner);

        try {
            game.play();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid choice. Please choose rock, paper, or scissors.");
        }

        scanner.close();
    }

}
