/*
 * =========================================================
 * Topic       : Loops
 * Problem     : Greatest Common Divisor (GCD)
 *
 * Description:
 * Write a program that takes two numbers as input and
 * calculates their Greatest Common Divisor (GCD).
 *
 * Logic:
 * - Take two integers as input
 * - Convert negative numbers to positive using Math.abs()
 * - Handle edge cases for zero values
 * - Use a loop to find the greatest number that divides both
 *
 * Concepts Used:
 * - for loop
 * - if-else conditions
 * - Math.abs()
 * - User input (Scanner)
 *
 * Example:
 * Input:
 * Enter first number: 12
 * Enter second number: 18
 *
 * Output:
 * GCD: 6
 *
 * Author: Muhammad Abdullah
 * =========================================================
 */

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 == 0 && num2 == 0) {
            System.out.println("Undefined");
            return;
        }

        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        if (num1 == 0) {
            System.out.println("GCD: " + num2);
            return;
        }

        if (num2 == 0) {
            System.out.println("GCD: " + num1);
            return;
        }

        int gcd = 1;

        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD: " + gcd);

        sc.close();
    }
}
