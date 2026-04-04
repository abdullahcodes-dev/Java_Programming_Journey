/*
 * ============================================================
 * Platform      : HackerRank
 * Challenge     : Java String Reverse
 * Difficulty    : Easy
 * Date          : 04 / 04 / 2026
 *
 * Problem Summary:
 * The task is to determine whether a given string is a
 * palindrome. A palindrome is a word that reads the same
 * forward and backward.
 *
 * In this solution, the string is first reversed using a loop.
 * The reversed string is then compared with the original
 * string using an if-else condition. If both strings are
 * equal, the program prints "Yes", otherwise it prints "No".
 *
 * Concepts Covered:
 * - String traversal using loops
 * - Building a reversed string
 * - Character access using charAt()
 * - String comparison using equals()
 * - Conditional statements (if-else)
 *
 * Key Learning Points:
 * - Strings can be accessed character by character using
 *   indexing.
 * - Reversing a string manually helps understand loops
 *   and string manipulation.
 * - The equals() method is used to compare string values
 *   in Java.
 *
 * Why This Problem Matters:
 * Palindrome checking is a common programming exercise
 * used to strengthen understanding of string manipulation,
 * loops, and logical comparisons.
 *
 * Author: Muhammad Abdullah
 * ============================================================
 */

import java.io.*;
import java.util.*;

public class HR_15_StringReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        StringBuilder sb = new StringBuilder(A);

        if (sb.reverse().toString().equals(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
