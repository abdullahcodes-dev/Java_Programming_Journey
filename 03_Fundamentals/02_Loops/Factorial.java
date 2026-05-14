/*
 * ================================================================
 * Topic       : Loops (For Loop)
 * Problem     : Factorial of a Number
 *
 * Description:
 * Write a program that takes a non-negative number as
 * input and calculates its factorial.
 *
 * Logic:
 * - Take number as input
 * - Validate input (should not be negative)
 * - Initialize factorial variable with 1
 * - Use a loop from 1 to N
 * - Multiply factorial variable in each iteration
 * - Print final factorial value
 *
 * Concepts Used:
 * - For loop
 * - Arithmetic operations
 * - Accumulator pattern
 * - User input (Scanner)
 * - Conditional statement (if)
 *
 * Example:
 * Input:
 * Enter a number: 5
 *
 * Output:
 * Factorial: 120
 *
 * Author: Muhammad Abdullah
 * ================================================================
 */

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid input");
            return;
        }

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial: " + fact);
    }
}
