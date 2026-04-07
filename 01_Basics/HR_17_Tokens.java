/*
 * ============================================================
 * Platform      : HackerRank
 * Challenge     : Java String Tokens
 * Difficulty    : Easy
 * Date          : 07 / 04 / 2026
 * Problem Summary:
 * The task is to split a given string into tokens (words)
 * based on specific delimiters such as spaces and punctuation.
 * After splitting the string, the program must print the
 * total number of tokens followed by each token on a new line.
 *
 * Approach Used:
 * The program reads a full line of input using Scanner.
 * The input string is then split using a regular expression
 * that treats spaces and punctuation characters as delimiters.
 * The resulting tokens are stored in a string array.
 *
 * If the input string is empty, the program prints 0.
 * Otherwise, it prints the number of tokens and then
 * iterates through the array to print each token.
 *
 * Concepts Covered:
 * - String input using Scanner
 * - String splitting using regular expressions
 * - Arrays
 * - For-each loops
 * - Conditional statements
 *
 * Why This Problem Matters:
 * Tokenizing text is a fundamental task in many areas
 * such as text processing, compilers, search engines,
 * and natural language processing.
 *
 * Author: Muhammad Abdullah
 * ============================================================
 */

import java.io.*;
import java.util.*;

public class HR_17_Anagrams {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        s = s.trim();

        if (s.isEmpty()) {
            System.out.println(0);
        } else {
            String[] tokens = s.split("[\\s!,?._'@]+");
            int length = tokens.length;
            System.out.println(length);

            for (String token : tokens) {
                System.out.println(token);
            }
        }

        scan.close();
    }
}
