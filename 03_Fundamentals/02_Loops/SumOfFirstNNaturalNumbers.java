/*
 * ================================================================
 * Topic       : Loops (For Loop)
 * Problem     : Sum of First N Natural Numbers
 *
 * Description:
 * Write a program that takes a positive number as input
 * and calculates the sum of the first N natural numbers.
 *
 * Logic:
 * - Take number as input
 * - Validate input (should be greater than 0)
 * - Use a loop from 1 to N
 * - Add each number to the sum variable
 * - Print final sum
 *
 * Concepts Used:
 * - For loop
 * - Accumulator pattern
 * - Arithmetic operations
 * - User input (Scanner)
 * - Conditional statement (if)
 *
 * Example:
 * Input:
 * Enter a number: 5
 *
 * Output:
 * Sum = 15
 *
 * Author: Muhammad Abdullah
 * ================================================================
 */

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
