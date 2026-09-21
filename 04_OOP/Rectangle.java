public class Rectangle {
    public double length;
    public double width;

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();

        r1.length = 10.5;
        r1.width = 7.6;

        System.out.println("Area: " + r1.calculateArea());
        System.out.println("Perimeter: " + r1.calculatePerimeter());
    }
}
