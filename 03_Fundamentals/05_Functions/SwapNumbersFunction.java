public class SwapNumbersFunction {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Inside function:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        swap(a, b);

        System.out.println("After function call:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
