import java.util.Scanner;

public class PatternsUsing2DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        char[][] pattern = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pattern[i][j] = '*';

                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }
    }
}
