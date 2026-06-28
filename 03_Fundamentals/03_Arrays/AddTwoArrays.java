import java.util.Scanner;

public class AddTwoArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of all arrays: ");
        int size = sc.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        int[] sum = new int[size];

        System.out.println("Enter elements of 1st array: ");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter elements of 2nd array: ");

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        //Sum of two arrays

        for (int i = 0; i < sum.length; i++) {
            sum[i] = arr1[i] + arr2[i];
        }

        System.out.println("1st Array: ");

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        System.out.println("2nd array: ");

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println();

        System.out.println("Sum of both arrays: ");

        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i] + " ");
        }

        sc.close();
    }
}
