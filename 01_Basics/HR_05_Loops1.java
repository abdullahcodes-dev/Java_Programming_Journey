/*
Date: 25 / 03 / 2026
Platform: HackerRank
Challenge: Java Loops I
Difficulty: Easy
Topic: Loops
Concepts Used:
- for loop
- basic arithmetic
- formatted output

What I Practiced:
- Iterating from 1 to 10
- Printing in required format
- Avoiding unnecessary nested loops

Notes:
- Keep N unchanged.
- Only one loop needed.

Author: Muhammad Abdullah
*/

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

public class HR_05_Loops1 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }
    }
}
