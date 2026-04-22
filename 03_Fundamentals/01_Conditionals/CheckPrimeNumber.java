/*
 * Problem: Check Prime Number
 * Topic: Loops, Conditional Statements
 *
 * Description:
 * This program takes an integer input from the user and determines
 * whether the number is a prime number or not.
 *
 * Logic:
 * - A prime number is a number greater than 1 that has only two factors: 1 and itself.
 * - If a number is less than or equal to 1, it is not a prime number.
 *
 * Approach:
 * - Take input using Scanner
 * - Assume the number is prime initially (isPrime = true)
 * - If number <= 1, mark it as not prime
 * - Otherwise, use a loop from 2 to (num - 1) to check divisibility
 * - If any number divides it, mark it as not prime and break the loop
 * - Print result based on the final value of isPrime
 *
 * Concepts Used:
 * - for loop
 * - if-else statements
 * - break statement
 * - boolean flag (isPrime)
 * - Modulo operator (%)
 *
 * Example:
 * Input: 2 → Output: PRIME NUMBER
 * Input: 4 → Output: NOT A PRIME NUMBER
 * Input: 1 → Output: NOT A PRIME NUMBER
 *
 * Author: Muhammad Abdullah
 */

import java.util.Scanner;

public class CheckPrimeNumber {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num - 1; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("PRIME NUMBER");
        } else {
            System.out.println("NOT A PRIME NUMBER");
        }

        sc.close();
    }
}
