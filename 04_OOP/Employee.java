public class Employee {
    public String name;
    public double salary;

    public double calculateBonus() {
        return salary * 0.10; //10% bonus
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.name = "Muhammad Abdullah";
        e1.salary = 80000;

        double bonus = e1.calculateBonus();

        System.out.println("Bonus: " + bonus);
    }
}
