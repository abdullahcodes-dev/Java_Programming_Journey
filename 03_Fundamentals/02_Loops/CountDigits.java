/*
 * ================================================================
 * Topic       : Loops (While Loop)
 * Problem     : Count Digits in a Number
 *
 * Description:
 * Write a program that takes an integer as input and
 * counts the total number of digits present in it.
 *
 * Logic:
 * - Take number as input
 * - Convert negative number to positive using Math.abs()
 * - Handle special case for 0
 * - Use a while loop to repeatedly divide the number by 10
 * - Increase digit count in each iteration
 *
 * Concepts Used:
 * - While loop
 * - Integer division
 * - Math.abs()
 * - User input (Scanner)
 * - Conditional statement (if)
 *
 * Example:
 * Input:
 * Enter a number: 12345
 *
 * Output:
 * Number of digits: 5
 *
 * Author: Muhammad Abdullah
 * ================================================================
 */

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = Math.abs(num);
        int count = 0;

        if (temp == 0) {
            System.out.println("Number of digits: 1");
            return;
        }

        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        System.out.println("Number of digits: " + count);

        sc.close();
    }
}
