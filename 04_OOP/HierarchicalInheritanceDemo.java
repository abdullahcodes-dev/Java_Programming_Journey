class Shape {
    public String color;

    void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    public double radius;

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    public double length, width;

    double calculateArea() {
        return length * width;
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Circle c = new Circle();

        c.color = "Blue";
        c.radius = 4.5;

        c.displayColor();

        System.out.println("Area of Circle: " + c.calculateArea());

        System.out.println();

        Rectangle r = new Rectangle();

        r.color = "Green";
        r.length = 10.4;
        r.width = 8.5;

        r.displayColor();

        System.out.println("Area of Rectangle: " + r.calculateArea());
    }
}
