class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid Name!");
        }
    }

    public void setEmployeeId(int employeeId) {
        if (employeeId > 0) {
            this.employeeId = employeeId;
        } else {
            System.out.println("Invalid Employee ID!");
        }
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary!");
        }
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

public class EmployeeValidation {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setName("Abdullah");
        e.setEmployeeId(101);
        e.setSalary(50000);

        e.displayDetails();

        e.setEmployeeId(-102);
        e.setSalary(-83000);

        e.displayDetails();
    }
}
