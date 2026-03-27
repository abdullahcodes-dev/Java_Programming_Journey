/*
 * ============================================================
 * Platform      : HackerRank
 * Challenge     : Java Datatypes
 * Difficulty    : Easy
 * Date          : 27 / 03 / 2026
 *
 * Problem Summary:
 * The challenge requires determining which primitive Java
 * data types can store a given integer value. For each input
 * number, we must check whether it fits into the following
 * types:
 *
 * - byte   (8-bit)
 * - short  (16-bit)
 * - int    (32-bit)
 * - long   (64-bit)
 *
 * If the value cannot be stored in any of these types,
 * we print that it cannot be fitted anywhere.
 *
 * Concepts Covered:
 * - Java primitive data types
 * - Range limits of numeric types
 * - Conditional statements (if conditions)
 * - Input handling using Scanner
 * - Exception handling (InputMismatchException)
 *
 * Key Learning Points:
 * - Each numeric type has a fixed storage size and range.
 * - Larger types can store values of smaller types.
 * - Using try/catch helps handle inputs that exceed long range.
 *
 * Why This Problem Matters:
 * Understanding data type limits is essential in systems
 * programming, memory management, and preventing overflow
 * errors in real-world applications.
 *
 * Author: Muhammad Abdullah
 * ============================================================
 */

import java.io.*;
import java.util.Scanner;

class HR_07_DataTypes {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");

                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}
