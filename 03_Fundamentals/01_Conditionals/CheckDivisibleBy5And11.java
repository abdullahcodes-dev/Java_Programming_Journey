/*
 * ============================================================
 * Topic         : Conditionals
 * Problem       : Check Divisibility by 5 and 11
 *
 * Description:
 * Write a program that takes a number as input and checks
 * whether it is divisible by both 5 and 11.
 *
 * Logic:
 * A number is divisible by both 5 and 11 if:
 * number % 5 == 0 AND number % 11 == 0
 *
 * Concepts Used:
 * - If-else statements
 * - Logical AND (&&)
 * - Modulus operator (%)
 * - User input (Scanner)
 *
 * Example:
 * Input:
 *  Enter a number: 55
 *
 * Output:
 *  The number is DIVISIBLE by 5 and 11
 *
 * Author: Muhammad Abdullah
 * ============================================================
 */

import java.util.Scanner;

public class CheckDivisibleBy5And11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println("The number is DIVISIBLE by 5 and 11");
        } else {
            System.out.println("The number is NOT DIVISIBLE by 5 and 11");
        }

        sc.close();
    }
}
