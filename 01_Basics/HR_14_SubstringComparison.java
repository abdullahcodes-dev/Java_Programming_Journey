/*
 * ============================================================
 * Platform      : HackerRank
 * Challenge     : Java Substring Comparisons
 * Difficulty    : Easy
 * Date          : 03 / 04 / 2026
 *
 * Problem Summary:
 * The task is to find the lexicographically smallest and
 * largest substrings of length k from a given string. The
 * program must generate all possible substrings of length k,
 * compare them using lexicographical order, and determine
 * the smallest and largest values.
 *
 * Concepts Covered:
 * - String manipulation
 * - substring() method
 * - String comparison using compareTo()
 * - Iteration using loops
 * - Lexicographical ordering
 *
 * Key Learning Points:
 * - substring(start, end) extracts a portion of a string.
 * - Lexicographical order is similar to dictionary order.
 * - compareTo() helps determine the ordering of two strings.
 * - Iterating through the string allows generation of all
 *   possible substrings of a fixed length.
 *
 * Why This Problem Matters:
 * String comparison and substring extraction are commonly
 * used in real-world applications such as search algorithms,
 * text processing, pattern matching, and data validation.
 *
 * Understanding lexicographical ordering is also important
 * for sorting algorithms and many computer science problems.
 *
 * Author: Muhammad Abdullah
 * ============================================================
 */

import java.util.Scanner;

public class HR_14_SubstringComparison {

    public static String getSmallestAndLargest(String s, int k) {
        String current_substring = s.substring(0, k);
        String smallest = current_substring;
        String largest = current_substring;

        for (int i = 1; i <= s.length() - k; i++) {
            current_substring = s.substring(i, i + k);

            if (current_substring.compareTo(largest) > 0) {
                largest = current_substring;
            }

            if (current_substring.compareTo(smallest) < 0) {
                smallest = current_substring;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
