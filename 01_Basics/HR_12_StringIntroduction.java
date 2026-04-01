/*
 * ============================================================
 * Platform      : HackerRank
 * Challenge     : Java Strings Introduction
 * Difficulty    : Easy
 * Date          : 01 / 04 / 2026
 *
 * Problem Summary:
 * The challenge involves performing basic operations on two
 * input strings. The program must:
 *
 * 1. Calculate and print the total length of both strings combined.
 * 2. Determine whether the first string is lexicographically
 *    greater than the second string.
 * 3. Capitalize the first letter of both strings and print
 *    them separated by a space.
 *
 * Concepts Covered:
 * - String input handling
 * - String length calculation
 * - Lexicographical comparison using compareTo()
 * - String manipulation
 * - Capitalizing characters using substring() and toUpperCase()
 *
 * Key Learning Points:
 * - Strings in Java are objects and provide many useful methods.
 * - The length() method returns the number of characters in a string.
 * - compareTo() is used for lexicographical (dictionary-like) comparison.
 * - substring() allows extraction of specific parts of a string.
 *
 * Why This Problem Matters:
 * String manipulation is one of the most common tasks in
 * programming. Applications frequently process text data,
 * such as user input, file contents, and messages.
 *
 * Understanding core string operations builds a foundation
 * for more advanced problems involving parsing, validation,
 * and text processing.
 *
 * Example Output:
 * 9
 * No
 * Hello Java
 *
 * Author: Muhammad Abdullah
 * ============================================================
 */

import java.io.*;
import java.util.Scanner;

public class HR_12_StringIntroduction {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.next();
        String B = input.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum = A.length() + B.length();
        int compare = A.compareTo(B);

        String newA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String newB = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(sum);

        if (compare > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(newA + ' ' + newB);
    }
}
