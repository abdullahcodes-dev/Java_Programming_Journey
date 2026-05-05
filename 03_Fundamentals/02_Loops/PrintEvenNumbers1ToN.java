/*
 * ============================================================
 * Topic       : Loops
 * Problem     : Print Even Numbers from 1 to N
 *
 * Description:
 * Write a program that takes a number as input and prints
 * all even numbers from 1 to that number.
 *
 * Logic:
 * - Take input n from the user
 * - If n <= 0 → Invalid input
 * - Otherwise, start loop from 2 and increment by 2
 * - Print each even number up to n
 *
 * Concepts Used:
 * - for loop
 * - if condition
 * - Increment by 2 (i += 2)
 * - User input (Scanner)
 *
 * Example:
 * Input:
 * Enter a number: 10
 *
 * Output:
 * 2 4 6 8 10
 *
 * Author: Muhammad Abdullah
 * ============================================================
 */

import java.util.Scanner;

public class PrintEvenNumbers1ToN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();

        sc.close();
    }
}
