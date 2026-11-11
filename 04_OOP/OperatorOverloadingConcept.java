class ComplexNumber {
    int real;
    int imaginary;

    ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(real + other.real, imaginary + other.imaginary);
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class OperatorOverloadingConcept {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(2, 3);
        ComplexNumber c2 = new ComplexNumber(3, 4);

        ComplexNumber result = c1.add(c2);

        c1.display();
        c2.display();
        result.display();
    }
}
