/*
 * ============================================================
 * Project       : CLI Calculator
 * Language      : Java
 *
 * Description:
 * A simple command-line calculator that performs basic
 * arithmetic operations. The program takes two numbers and
 * an operator as input from the user and displays the result.
 *
 * Features:
 * - Supports +, -, *, / operations
 * - Handles division by zero
 * - Validates operator input
 *
 * Concepts Used:
 * - User input using Scanner
 * - Switch expressions
 * - Conditional statements
 * - Basic arithmetic operations
 *
 * Example:
 * Input:
 *  Enter first number: 4
 *  Enter operator: *
 *  Enter second number: 2
 *
 * Output:
 *  Result = 8.0
 *
 * Author: Muhammad Abdullah
 * ============================================================
 */

import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter operator (+, -, /, *): ");
        char operator = input.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        double result = 0;
        boolean validOperation = true;

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }
            default -> {
                System.out.println("Invalid Operator!");
                validOperation = false;
            }
        }

        if (validOperation) {
            System.out.println("Result = " + result);
        }

        input.close();
    }
}
