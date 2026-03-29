/*
 * ============================================================
 * Platform      : HackerRank
 * Challenge     : Java Static Initializer Block
 * Difficulty    : Easy
 * Date          : 29 / 03 / 2026
 *
 * Problem Summary:
 * The challenge requires using a static initialization block
 * to check whether the given values of breadth (B) and height (H)
 * of a parallelogram are valid. If both values are positive,
 * the program calculates and prints the area of the parallelogram.
 * If either value is less than or equal to zero, an exception
 * message must be printed.
 *
 * Concepts Covered:
 * - Static variables
 * - Static initialization blocks
 * - Conditional statements
 * - Exception handling
 *
 * Key Learning Points:
 * - A static block is executed when the class is loaded into memory,
 *   before the main() method runs.
 * - Static variables belong to the class rather than an object.
 * - Static initialization blocks are useful when performing
 *   setup operations for class-level data.
 *
 * Why This Problem Matters:
 * Understanding static initialization is important for learning
 * how Java loads classes and manages shared data across objects.
 * Static blocks are often used in real-world applications for
 * configuration loading and one-time initialization tasks.
 *
 * Author: Muhammad Abdullah
 * ============================================================
 */

import java.io.*;
import java.util.Scanner;

public class HR_09_StaticInitializationBlock {

    static int B, H;
    static boolean flag = true;

    static {
        Scanner input = new Scanner(System.in);

        B = input.nextInt();
        H = input.nextInt();

        input.close();

        try {
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }
}
