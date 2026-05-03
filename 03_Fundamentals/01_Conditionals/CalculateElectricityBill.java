/*
 * ============================================================
 * Topic       : Conditionals
 * Problem     : Calculate Electricity Bill
 *
 * Description:
 * Write a program that takes the number of electricity units
 * consumed and calculates the total bill based on slab rates.
 *
 * Logic:
 * - If units <= 100 → 10 PKR per unit
 * - If units <= 200 → 100 units at 10 + remaining at 15
 * - If units > 200  → 100 units at 10 + next 100 at 15 + remaining at 20
 * - If units < 0    → Invalid input
 *
 * Concepts Used:
 * - If-else if ladder
 * - Arithmetic operations
 * - User input (Scanner)
 * - Variables for slab calculation
 *
 * Example:
 * Input:
 * Enter number of units consumed: 170
 *
 * Output:
 * Total bill (in PKR): 2050
 *
 * Author: Muhammad Abdullah
 * ============================================================
 */

import java.util.Scanner;

public class CalculateElectricityBill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int units;
        int bill;
        int firstSlab = 100 * 10;
        int secondSlab = 100 * 15;

        System.out.print("Enter number of units consumed: ");
        units = sc.nextInt();

        if (units < 0) {
            System.out.println("INVALID INPUT");
            return;
        }

        if (units <= 100) {
            bill = units * 10;
        } else if (units <= 200) {
            bill = firstSlab + (units - 100) * 15;
        } else {
            bill = firstSlab + secondSlab + (units - 200) * 20;
        }

        System.out.println("Total bill (in PKR): " + bill);

        sc.close();
    }
}
