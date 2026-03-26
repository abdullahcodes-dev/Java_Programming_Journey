/*
 * ============================================================
 * Platform      : HackerRank
 * Challenge     : Java Loops II
 * Difficulty    : Easy (Logic Intensive)
 * Date          : 26 / 03 / 2026
 *
 * Problem Summary:
 * The problem requires generating a mathematical series for
 * multiple queries. For each query containing integers a, b,
 * and n, we must print n terms of the series:
 *
 *     a + (2^0 * b)
 *     a + (2^0 * b + 2^1 * b)
 *     a + (2^0 * b + 2^1 * b + 2^2 * b)
 *     ...
 *
 * Each term accumulates the previous value and adds the next
 * power of 2 multiplied by b.
 *
 * Concepts Covered:
 * - Nested loops
 * - Accumulator pattern (running sum)
 * - Handling multiple test cases
 * - Exponential growth (powers of 2)
 * - Variable scope and resetting per query
 *
 * Key Learning Points:
 * - Each query must reset its own sum and power variables.
 * - The inner loop generates the series terms.
 * - The outer loop processes multiple independent queries.
 * - Understanding scope is critical to avoid incorrect carry-over values.
 *
 * Why This Problem Matters:
 * This challenge strengthens control flow thinking and teaches
 * how to manage state within nested loops. It also reinforces
 * mathematical pattern implementation in code.
 *
 * Author: Muhammad Abdullah
 * ============================================================
 */

import java.io.*;
import java.util.*;

public class HR_06_Loops2 {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int pow = 1;
            int sum = a;

            for (int j = 0; j < n; j++) {
                sum = sum + pow * b;
                pow = pow * 2;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
