/*
 * Problem: Check Leap Year
 * Topic: Conditional Statements (if-else), Logical Operators
 *
 * Description:
 * This program takes a year as input from the user and determines
 * whether it is a leap year or not.
 *
 * Logic:
 * A year is considered a leap year if:
 * 1. It is divisible by 4 AND not divisible by 100
 *    OR
 * 2. It is divisible by 400
 *
 * This ensures correct handling of century years.
 *
 * Approach:
 * - Take user input using Scanner
 * - Apply conditional logic using modulo (%) operator
 * - Store result in a boolean variable (isLeapYear)
 * - Print result based on the condition
 *
 * Concepts Used:
 * - Conditional statements (if-else)
 * - Logical operators (&&, ||)
 * - Modulo operator (%)
 * - Boolean variables
 * - User input handling (Scanner)
 *
 * Example:
 * Input: 2024 → Output: LEAP YEAR
 * Input: 2025 → Output: NOT LEAP YEAR
 */

import java.util.Scanner;

public class CheckLeapYear {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        boolean isLeapYear = false;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) {
            isLeapYear = true;
        }

        if (isLeapYear) {
            System.out.println("LEAP YEAR");
        } else {
            System.out.println("NOT LEAP YEAR");
        }

        sc.close();
    }
}
