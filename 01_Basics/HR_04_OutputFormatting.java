/*
Platform: HackerRank
Track: Java - Introduction
Problem: Java Output Formatting
Difficulty: Easy
Concepts: printf, Formatting, Strings
Date: 27-02-2026
*/

import java.util.Scanner;

public class HR_04_OutputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
    }
}
