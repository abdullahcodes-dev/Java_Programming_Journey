class Vehicle {
    public String brand;
}

class Car extends Vehicle {
    public int numberOfDoors;
}

class ElectricCar extends Car {
    public int batteryCapacity;
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        ElectricCar e1 = new ElectricCar();

        e1.brand = "Tesla";
        e1.numberOfDoors = 4;
        e1.batteryCapacity = 100;

        System.out.println(e1.brand);
        System.out.println(e1.numberOfDoors);
        System.out.println(e1.batteryCapacity);
    }
}
