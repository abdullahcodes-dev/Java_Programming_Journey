public class ArraySumFunction {

    public static int sumArray(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, 3, 0 };

        System.out.println("Sum of all elements: " + sumArray(arr));
    }
}
