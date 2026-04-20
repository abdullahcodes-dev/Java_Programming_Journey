import java.util.Scanner;

public class CheckDivisibleBy5And11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println("The number is DIVISIBLE by 5 and 11");
        } else {
            System.out.println("The number is NOT DIVISIBLE by 5 and 11");
        }

        sc.close();
    }
}

