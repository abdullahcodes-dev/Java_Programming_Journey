abstract class Shape {
    abstract double area();

    void display() {
        System.out.println("Calculating shape area...");
    }
}

class Circle extends Shape {
    double radius;

    @Override
    double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    @Override
    double area() {
        return length * width;
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 5;

        Rectangle r = new Rectangle();
        r.length = 10;
        r.width = 4;

        c.display();
        System.out.println("Circle area: " + c.area());

        System.out.println();

        r.display();
        System.out.println("Rectangle area: " + r.area());
    }
}
