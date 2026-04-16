/*
 * ============================================================
 * Topic         : Conditionals
 * Problem       : Check Positive, Negative or Zero
 *
 * Description:
 * Write a program that takes a number as input and determines
 * whether it is positive, negative, or zero.
 *
 * Logic:
 * - If number > 0 → Positive
 * - If number < 0 → Negative
 * - Otherwise → Zero
 *
 * Concepts Used:
 * - If-else if ladder
 * - Comparison operators
 * - User input (Scanner)
 *
 * Example:
 * Input:
 *  Enter a number: -5
 *
 * Output:
 *  The number is NEGATIVE
 *
 * Author: Muhammad Abdullah
 * ============================================================
 */

import java.util.Scanner;

public class CheckNumberSign {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("The number is POSITIVE");
        } else if (num < 0) {
            System.out.println("The number is NEGATIVE");
        } else {
            System.out.println("The number is ZERO");
        }

        sc.close();
    }
}
