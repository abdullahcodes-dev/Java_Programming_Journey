import java.util.Scanner;

public class PrimeNumberFunction {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean result = isPrime(num);

        if (result) {
            System.out.println("Prime Number");
        } else {
            System.out.println("NOT a prime number");
        }
    }
}
