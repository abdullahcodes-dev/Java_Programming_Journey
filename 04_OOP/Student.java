public class Student {
    public String name;
    public String rollNo;
    public double marks;
    public String grade;

    public static String grade(double marks) {
        if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Muhammad Abdullah";
        s1.rollNo = "SP26-BCS-056";
        s1.marks = 92.5;
        s1.grade = grade(s1.marks);

        System.out.println("Name: " + s1.name);
        System.out.println("Roll Number: " + s1.rollNo);
        System.out.println("Marks: " + s1.marks);
        System.out.println("Grade: " + s1.grade);
    }
}
