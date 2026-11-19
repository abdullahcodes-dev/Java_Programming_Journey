class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Salary: " + getSalary());
    }
}

public class EmployeeEncapsulation {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setName("Abdullah");
        e.setEmployeeId(101);
        e.setSalary(50000);

        e.displayDetails();
    }
}
