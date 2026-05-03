/*
 * ============================================================
 * Topic       : Loops, Number Manipulation
 * Problem     : Check Palindrome Number
 *
 * Description:
 * Write a program that takes a number as input and checks
 * whether it is a palindrome or not.
 *
 * Logic:
 * - Reverse the given number
 * - Compare the reversed number with the original number
 * - If both are equal → Palindrome
 * - Otherwise → Not a Palindrome
 *
 * Concepts Used:
 * - While loop
 * - Modulo operator (%)
 * - Integer division (/)
 * - Variable manipulation
 *
 * Example:
 * Input:
 * Enter a number: 121
 *
 * Output:
 * PALINDROME
 *
 * Author: Muhammad Abdullah
 * ============================================================
 */

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int n = num;

        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (reverse == n) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT A PALINDROME");
        }

        sc.close();
    }
}
