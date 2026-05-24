/*
 * ================================================================
 * Topic       : Loops (For Loop)
 * Problem     : Fibonacci Series
 *
 * Description:
 * Write a program that takes a positive number as input
 * and prints the Fibonacci series up to N terms.
 *
 * Logic:
 * - Take number as input
 * - Validate input (should be greater than 0)
 * - Initialize first two Fibonacci numbers (0 and 1)
 * - Use a loop to generate next terms
 * - Print each term of the series
 *
 * Concepts Used:
 * - For loop
 * - Variable swapping
 * - Arithmetic operations
 * - User input (Scanner)
 * - Conditional statement (if)
 *
 * Example:
 * Input:
 * Enter a number: 5
 *
 * Output:
 * 0 1 1 2 3
 *
 * Author: Muhammad Abdullah
 * ================================================================
 */

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        sc.close();
    }
}
