import java.util.Scanner;

public class PrintNumbers1ToN {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
