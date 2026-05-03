/*
 * ============================================================
 * Topic       : Conditionals
 * Problem     : Check Vowel or Consonant
 *
 * Description:
 * Write a program that takes a character as input and checks
 * whether it is a vowel or a consonant.
 *
 * Logic:
 * - Convert the input character to lowercase
 * - Check if it is an alphabet (a–z)
 * - If it is one of: a, e, i, o, u → Vowel
 * - Otherwise → Consonant
 * - If not an alphabet → Invalid input
 *
 * Concepts Used:
 * - If-else statements
 * - Logical operators (||, &&)
 * - Character handling
 * - User input (Scanner)
 *
 * Example:
 * Input:
 * Enter a character: a
 *
 * Output:
 * VOWEL
 *
 * Author: Muhammad Abdullah
 * ============================================================
 */

import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char letter = Character.toLowerCase(sc.next().charAt(0));

        if (letter >= 'a' && letter <= 'z') {
            if (
                letter == 'a' ||
                letter == 'e' ||
                letter == 'i' ||
                letter == 'o' ||
                letter == 'u'
            ) {
                System.out.println("VOWEL");
            } else {
                System.out.println("CONSONANT");
            }
        } else {
            System.out.println("INVALID INPUT");
        }

        sc.close();
    }
}
