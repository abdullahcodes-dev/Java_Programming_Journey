import java.util.Scanner;

public class AddTwoMatrices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row size of all matrices: ");
        int rows = sc.nextInt();

        System.out.print("Enter column size of all matrices: ");
        int columns = sc.nextInt();

        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] sum = new int[rows][columns];

        System.out.println("Enter elements of 1st matrix: ");

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of 2nd matrix: ");

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        //Sum of matrices

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("1st Matrix: ");

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("2nd Matrix: ");

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("Sum of Matrices: ");

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
