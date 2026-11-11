class Calculator {
    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    double multiply(double a, double b) {
        return a * b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.multiply(5, 4));
        System.out.println(c.multiply(2, 3, 4));
        System.out.println(c.multiply(2.5, 4.0));
    }
}
