/*
Challenge: Java Stdin and Stdout II
Platform: HackerRank
Date: 23 / 03 / 2026

Description:
Read an integer, a double, and a String from standard input.
Then print them in the required format:
String: <input string>
Double: <input double>
Int: <input integer>

Key Concept:
When using nextInt() or nextDouble() before nextLine(),
an extra nextLine() is required to consume the leftover newline.
 */

import java.util.Scanner;

public class HR_03_StdinStdout2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
