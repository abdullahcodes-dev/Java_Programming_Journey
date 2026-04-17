/*
 * ============================================================
 * Topic         : Conditionals
 * Problem       : Find Largest of Three Numbers
 *
 * Description:
 * Write a program that takes three numbers as input and
 * determines the largest among them.
 *
 * Logic:
 * Compare all three numbers using conditional statements
 * and logical operators to find the greatest value.
 *
 * Concepts Used:
 * - If-else if ladder
 * - Logical operators (&&)
 * - Comparison operators
 * - User input (Scanner)
 *
 * Example:
 * Input:
 *  Enter first number: 8
 *  Enter second number: 7
 *  Enter third number: 6
 *
 * Output:
 *  The largest number is: 8
 *
 * Author: Muhammad Abdullah
 * ============================================================
 */

import java.util.Scanner;

public class LargestOfThreeNumbers {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("The largest number is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The largest number is: " + num2);
        } else {
            System.out.println("The largest number is: " + num3);
        }

        sc.close();
    }
}
