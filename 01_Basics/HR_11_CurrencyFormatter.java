/*
 * ============================================================
 * Platform      : HackerRank
 * Challenge     : Java Currency Formatter
 * Difficulty    : Easy
 * Date          : 31 / 03 / 2026
 *
 * Problem Summary:
 * The task is to format a given payment value into currency
 * formats for different countries: US, India, China, and
 * France. Java's NumberFormat class is used to convert the
 * numeric value into properly formatted currency strings
 * according to each locale.
 *
 * Concepts Covered:
 * - Java NumberFormat class
 * - Locale class
 * - Currency formatting
 * - Internationalization (i18n)
 *
 * Key Learning Points:
 * - NumberFormat.getCurrencyInstance() formats numbers as
 *   currency based on locale.
 * - Locale objects represent regional settings such as
 *   language and country.
 * - Custom Locale can be created for countries like India.
 *
 * Why This Problem Matters:
 * Currency and number formatting is essential for global
 * applications such as e-commerce systems, banking software,
 * financial dashboards, and international services.
 *
 * It demonstrates how Java supports internationalization
 * through built-in libraries.
 *
 * Example Output:
 * US: $12,324.13
 * India: Rs.12,324.13
 * China: ￥12,324.13
 * France: 12 324,13 €
 *
 * Author: Muhammad Abdullah
 * ============================================================
 */

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.Scanner;
import java.util.regex.*;

public class HR_11_CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(
            new Locale("en", "in")
        );
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(
            Locale.CHINA
        );
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(
            Locale.FRANCE
        );

        String us = usFormat.format(payment);
        String india = indiaFormat.format(payment);
        String china = chinaFormat.format(payment);
        String france = franceFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
