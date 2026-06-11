/*
 * ============================================================
 * Topic        : Loops
 * Problem      : Armstrong Number Check
 *
 * Description:
 * Write a program that checks whether a number is an
 * Armstrong number or not.
 *
 * Logic:
 * - Count the total number of digits
 * - Extract each digit using modulus (%)
 * - Raise each digit to the power of the digit count
 * - Add the results
 * - Compare the sum with the original number
 *
 * Concepts Used:
 * - While loops
 * - Digit extraction
 * - Math.pow()
 * - Conditional statements
 * - User input (Scanner)
 *
 * Example:
 * Input:
 * Enter a number: 153
 *
 * Output:
 * Armstrong number
 *
 * Author: Muhammad Abdullah
 * ============================================================
 */

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Armstrong number");
            return;
        }

        int temp = Math.abs(num);
        int count = 0;

        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, count);
            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }

        sc.close();
    }
}
