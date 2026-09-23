public class Car {
    public String brand;
    public String model;

    public void start() {
        System.out.println("Car started!");
    }

    public void stop() {
        System.out.println("Car stopped!");
    }

    public void displayInfo() {
        System.out.println("Car: " + brand + " " + model);
    }

    public static void main(String[] args) {
        Car c1 = new Car();

        c1.brand = "Honda";
        c1.model = "City";

        c1.displayInfo();
        c1.start();
        c1.stop();
    }
}
