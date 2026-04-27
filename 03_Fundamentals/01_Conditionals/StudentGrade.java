/*
 * ============================================================
 * Topic       : Conditionals
 * Problem     : Student Grade Calculator
 *
 * Description:
 * Write a program that takes student marks as input and
 * assigns a grade based on the marks.
 *
 * Logic:
 * - Marks >= 90  → Grade A
 * - Marks >= 80  → Grade B
 * - Marks >= 70  → Grade C
 * - Marks >= 50  → Grade D
 * - Otherwise    → Grade F
 *
 * Concepts Used:
 * - If-else if ladder
 * - Comparison operators
 * - User input (Scanner)
 *
 * Example:
 * Input:
 * Enter student marks: 90
 *
 * Output:
 * Grade: A
 *
 * Author: Muhammad Abdullah
 * ============================================================
 */

import java.util.Scanner;

public class StudentGrade {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student marks: ");
        double marks = sc.nextDouble();

        char grade;

        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        sc.close();
    }
}
