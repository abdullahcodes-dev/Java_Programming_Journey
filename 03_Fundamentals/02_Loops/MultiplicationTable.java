/*
 * ================================================================
 * Topic       : Loops (For Loop)
 * Problem     : Multiplication Table
 *
 * Description:
 * Write a program that takes a number as input and prints
 * its multiplication table from 1 to 10.
 *
 * Logic:
 * - Take number as input
 * - Validate input (should be greater than 0)
 * - Use a loop from 1 to 10
 * - Multiply input number with loop counter
 * - Print result in formatted form
 *
 * Concepts Used:
 * - For loop
 * - Arithmetic operations (*)
 * - User input (Scanner)
 * - Conditional statement (if)
 *
 * Example:
 * Input:
 * Enter a number: 5
 *
 * Output:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * ...
 * 5 x 10 = 50
 *
 * Author: Muhammad Abdullah
 * ================================================================
 */

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }

        sc.close();
    }
}
