/*
 * ============================================================
 * Topic         : Conditionals
 * Problem       : Check Even or Odd Number
 *
 * Description:
 * Write a program that takes an integer as input and checks
 * whether the number is even or odd.
 *
 * Logic:
 * A number is even if it is divisible by 2, otherwise it is odd.
 *
 * Concepts Used:
 * - If-else statements
 * - Modulus operator (%)
 * - User input (Scanner)
 *
 * Example:
 * Input:
 *  Enter a number: 4
 *
 * Output:
 *  The number is EVEN
 *
 * Author: Muhammad Abdullah
 * ============================================================
 */

import java.util.Scanner;

public class CheckEvenOdd {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is EVEN");
        } else {
            System.out.println("The number is ODD");
        }

        sc.close();
    }
}
