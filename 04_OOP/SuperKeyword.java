class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Manager m = new Manager("Abdullah", 80000, "IT");
        m.display();
    }
}
