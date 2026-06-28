import java.util.Scanner;

public class RowColumnSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of matrix: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns of matrix: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter elements of matrix: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("Sum of Rows: ");

        //Loop for sum of rows

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }

            System.out.println("Sum of " + i + " row: " + sum);
        }

        System.out.println("Sum of Columns: ");

        //Loop for sum of columns

        for (int j = 0; j < matrix[0].length; j++) {
            int sum = 0;

            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }

            System.out.println("Sum of " + j + " column: " + sum);
        }
    }
}
