import java.util.Scanner;

public class TransposeMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows of matrix: ");
        int rows = sc.nextInt();

        System.out.print("Enetr number of columns of matrix: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];
        int[][] transpose = new int[columns][rows];

        System.out.println("Enter elements of matrix: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //Loop for transpose

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Original matrix: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("Transpose of matrix: ");

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }

            System.out.println();
        }
    }
}
