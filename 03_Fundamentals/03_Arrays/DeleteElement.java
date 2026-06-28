import java.util.Scanner;

public class DeleteElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements in array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.print("Enter target you want to delete: ");
        int target = sc.nextInt();

        int index = -1;

        //Finding the index

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        //Loop for element deletion
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
        }

        System.out.println("Updated array: ");

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
