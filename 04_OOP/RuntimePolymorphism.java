class Animal {
    void makeSound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal a = new Dog();

        a.makeSound();

        a = new Cat();

        a.makeSound();
    }
}
