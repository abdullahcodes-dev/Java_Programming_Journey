import java.util.Scanner;

public class ReverseNumberFunction {

    public static int reverseNumber(int num) {
        int digit;
        int reverse = 0;

        while (num > 0) {
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = reverseNumber(num);

        System.out.println("Reversed number: " + result);

        sc.close();
    }
}
