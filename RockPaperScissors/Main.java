package JavaPractice.RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            Scanner scanner = new Scanner(System.in);
            String playerMove;
            while (true) {
                System.out.println("Please, enter your move : R, P or S");
                playerMove = scanner.nextLine();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println("Invalid move/input");

            }

            System.out.println("AI played: " + computerMove);
            if (playerMove.equals(computerMove)) {
                System.out.println("The game was a tie");
            } else if (playerMove.equals("r")) {
                if (computerMove.equals("p")) System.out.println("You lose.");
                else if (computerMove.equals("s")) System.out.println("You win.");
            } else if (playerMove.equals("p")) {
                if (computerMove.equals("s")) System.out.println("You lose.");
                else if (computerMove.equals("r")) System.out.println("You win.");
            } else if (playerMove.equals("s")) {
                if (computerMove.equals("r")) System.out.println("You lose.");
                else if (computerMove.equals("p")) System.out.println("You win.");
            }

            System.out.println("One more game? (y/n)");
            String oneMoreGame = scanner.nextLine();
            if (!oneMoreGame.equals("y")) break;
            scanner.close();
        }
    }
}
