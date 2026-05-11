/*
 * ================================================================
 * Topic       : Loops (While Loop)
 * Problem     : Reverse a Number
 *
 * Description:
 * Write a program that takes an integer as input and
 * prints the reverse of the number.
 *
 * Logic:
 * - Take number as input
 * - Store sign information for negative numbers
 * - Convert number to positive using Math.abs()
 * - Extract digits one by one using modulus operator
 * - Build reversed number using arithmetic operations
 * - Restore negative sign if needed
 *
 * Concepts Used:
 * - While loop
 * - Arithmetic operations
 * - Modulus operator (%)
 * - Integer division
 * - Math.abs()
 * - User input (Scanner)
 *
 * Example:
 * Input:
 * Enter a number: 52672
 *
 * Output:
 * Reverse: 27625
 *
 * Author: Muhammad Abdullah
 * ================================================================
 */

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isNegative = num < 0;

        int temp = Math.abs(num);

        int reverse = 0;

        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        if (isNegative) {
            reverse = -reverse;
        }

        System.out.println("Reverse: " + reverse);

        sc.close();
    }
}
