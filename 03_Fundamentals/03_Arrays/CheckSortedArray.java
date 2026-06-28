import java.util.Scanner;

public class CheckSortedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isSorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (!isSorted) {
            System.out.println("Not sorted");
        } else {
            System.out.println("Sorted");
        }

        sc.close();
    }
}
