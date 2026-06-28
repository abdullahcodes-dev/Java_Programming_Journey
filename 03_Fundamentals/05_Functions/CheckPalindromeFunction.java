import java.util.Scanner;

public class CheckPalindromeFunction {

    public static int reverseNumber(int n) {
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        return reverse;
    }

    public static boolean checkPalindrome(int n) {
        int reverse = reverseNumber(n);

        boolean isPalindrome = false;

        if (n == reverse) {
            isPalindrome = true;
        }

        return isPalindrome;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (checkPalindrome(num)) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}
