/*
 * ============================================================
 * Platform      : HackerRank
 * Challenge     : Java Substring
 * Difficulty    : Easy
 * Date          : 02 / 04 / 2026
 *
 * Problem Summary:
 * The task is to extract and print a substring from a given
 * string using the provided start and end indices. The
 * substring method of the String class is used to obtain the
 * portion of the string between the specified indices.
 *
 * Concepts Covered:
 * - String manipulation
 * - substring() method in Java
 * - String indexing
 * - Input handling using Scanner
 *
 * Key Learning Points:
 * - Strings in Java are zero-indexed, meaning the first
 *   character starts at index 0.
 * - substring(beginIndex, endIndex) extracts characters
 *   starting from beginIndex up to (but not including)
 *   endIndex.
 * - Proper index handling is important to avoid errors
 *   such as StringIndexOutOfBoundsException.
 *
 * Why This Problem Matters:
 * Extracting parts of strings is a common task in software
 * development. Substrings are frequently used when parsing
 * user input, processing text files, validating data, and
 * manipulating strings in applications.
 *
 * Author: Muhammad Abdullah
 * ============================================================
 */

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.Scanner;
import java.util.regex.*;

public class HR_13_Substring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        String newS = S.substring(start, end);

        System.out.println(newS);
    }
}
