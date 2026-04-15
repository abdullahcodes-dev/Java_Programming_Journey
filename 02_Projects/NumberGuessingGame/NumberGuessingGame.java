/*
 * ============================================================
 * Project       : Number Guessing Game
 * Language      : Java
 *
 * Description:
 * A simple command-line game where the user tries to guess a
 * randomly generated number between 1 and 100. The program
 * provides feedback after each guess (too high / too low)
 * until the correct number is guessed.
 *
 * Features:
 * - Random number generation
 * - User input handling
 * - Loop until correct guess
 * - Tracks number of attempts
 * - Provides hints (high/low)
 *
 * Concepts Used:
 * - Random class
 * - Loops (do-while)
 * - Conditional statements (if-else)
 * - User input using Scanner
 *
 * Example:
 * Input:
 *  Enter your guess: 50
 *
 * Output:
 *  TOO HIGH! Try again.
 *
 * Author: Muhammad Abdullah
 * ============================================================
 */

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String args[]) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("WELCOME TO THE NUMBER GUESSING GAME!");
        System.out.println("Guess a number between (1 - 100)");

        int guess;
        int randomNumber = random.nextInt(1, 100 + 1);
        int attempts = 0;

        do {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            attempts++;

            if (guess > randomNumber) {
                System.out.println("TOO HIGH! Try again.");
            } else if (guess < randomNumber) {
                System.out.println("TOO LOW! Try again.");
            } else {
                System.out.println(
                    "YOU GUESS CORRECTLY! The number is: " + randomNumber
                );
                System.out.println("Number of attempts: " + attempts);
            }
        } while (guess != randomNumber);

        input.close();
    }
}
