class Employee {
    public String name;
    private double salary;
    protected String department;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + getSalary());
        System.out.println("Department: " + department);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Manager m = new Manager();

        m.name = "Abdullah";
        m.department = "Software Development";
        m.setSalary(50000);

        m.displayEmployeeDetails();
        m.displayManagerDetails();
    }
}
