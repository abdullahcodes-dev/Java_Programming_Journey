import java.util.Scanner;

public class MergeArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int size1 = sc.nextInt();

        int[] arr1 = new int[size1];

        System.out.println("Enter elements first array: ");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int size2 = sc.nextInt();

        int[] arr2 = new int[size2];

        System.out.println("Enter elements second array: ");

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] merged = new int[arr1.length + arr2.length];
        int k = 0;

        for (int i = 0; i < arr1.length; i++) {
            merged[k] = arr1[i];
            k++;
        }

        for (int i = 0; i < arr2.length; i++) {
            merged[k] = arr2[i];
            k++;
        }

        System.out.println("First array: ");

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        System.out.println("Second array: ");

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println();

        System.out.println("Merged array: ");

        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }

        System.out.println();

        sc.close();
    }
}
