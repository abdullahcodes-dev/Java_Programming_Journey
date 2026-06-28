import java.util.Scanner;

public class LargestOfThreeNumbersFunction {

    public static int findLargest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter 3rd number: ");
        int num3 = sc.nextInt();

        int result = findLargest(num1, num2, num3);

        System.out.println("Largest number: " + result);

        sc.close();
    }
}
