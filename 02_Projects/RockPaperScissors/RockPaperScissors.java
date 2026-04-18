/*
 * ============================================================
 * Project       : Rock Paper Scissors (CLI)
 * Language      : Java
 *
 * Description:
 * A command-line Rock Paper Scissors game where the user plays
 * against the computer. The game continues until the user
 * chooses to exit.
 *
 * Features:
 * - User input (rock, paper, scissors)
 * - Random computer choice
 * - Input validation
 * - Win / Lose / Draw logic
 * - Play again option (loop)
 *
 * Concepts Used:
 * - Conditional statements
 * - Loops (do-while)
 * - Random class
 * - String handling
 * - User input (Scanner)
 *
 * Example:
 * Input:
 *  rock
 *
 * Output:
 *  Computer choice: scissors
 *  YOU WIN!
 *
 * Author: Muhammad Abdullah
 * ============================================================
 */

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String args[]) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        String moves[] = { "rock", "paper", "scissors" };
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        System.out.println("WELCOME TO THE ROCK PAPER SCISSORS GAME!");

        do {
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = sc.nextLine().toLowerCase();

            if (
                !playerChoice.equals("rock") &&
                !playerChoice.equals("paper") &&
                !playerChoice.equals("scissors")
            ) {
                System.out.println("INVALID CHOICE");
                continue;
            }

            computerChoice = moves[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("DRAW");
            } else if (
                (playerChoice.equals("rock") &&
                    computerChoice.equals("scissors")) ||
                (playerChoice.equals("paper") &&
                    computerChoice.equals("rock")) ||
                (playerChoice.equals("scissors") &&
                    computerChoice.equals("paper"))
            ) {
                System.out.println("YOU WIN! Congratulations.");
            } else {
                System.out.println("YOU LOSE! Too bad.");
            }

            System.out.print("Play again (yes/no): ");
            playAgain = sc.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing! See you next time.");
    }
}
