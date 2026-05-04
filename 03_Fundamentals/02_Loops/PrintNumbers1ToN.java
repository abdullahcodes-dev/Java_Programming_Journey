/*
 * ============================================================
 * Topic       : Loops
 * Problem     : Print Numbers from 1 to N
 *
 * Description:
 * Write a program that takes a number as input and prints
 * all numbers from 1 to that number.
 *
 * Logic:
 * - Take input n from the user
 * - If n <= 0 → Invalid input
 * - Otherwise, use a loop from 1 to n
 * - Print each number in sequence
 *
 * Concepts Used:
 * - for loop
 * - if-else condition
 * - User input (Scanner)
 *
 * Example:
 * Input:
 * Enter a number: 5
 *
 * Output:
 * 1 2 3 4 5
 *
 * Author: Muhammad Abdullah
 * ============================================================
 */

import java.util.Scanner;

public class PrintNumbers1ToN {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
