class Person {
    public String name;
    public int age;
}

class Student extends Person {
    public int rollNumber;
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Muhammmad Abdullah";
        s1.age = 20;
        s1.rollNumber = 56;

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
    }
}
