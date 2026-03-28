/*
 * ============================================================
 * Platform      : HackerRank
 * Challenge     : Java End-of-file
 * Difficulty    : Easy
 * Date          : 28 / 03 / 2026
 *
 * Problem Summary:
 * The task is to read input from standard input until the end
 * of the file (EOF) is reached. Each line of input must be
 * printed with a line number prefix starting from 1.
 *
 * Example Output Format:
 * 1 First line
 * 2 Second line
 * 3 Third line
 *
 * Concepts Covered:
 * - Input handling using Scanner
 * - Detecting end-of-file (EOF)
 * - while loops for continuous input processing
 * - String input using nextLine()
 *
 * Key Learning Points:
 * - Programs sometimes do not know how many inputs they will
 *   receive beforehand.
 * - The hasNext() method allows us to keep reading input until
 *   no more data is available.
 * - Maintaining a counter helps track and label each line.
 *
 * Why This Problem Matters:
 * Reading input until EOF is common in command-line programs,
 * log processing tools, and competitive programming problems.
 * It helps build understanding of dynamic input handling.
 *
 * Author: Muhammad Abdullah
 * ============================================================
 */

import java.io.*;
import java.util.Scanner;

public class HR_08_EndOfFile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 1;

        while (input.hasNext()) {
            System.out.println(n++ + " " + input.nextLine());
        }
    }
}
