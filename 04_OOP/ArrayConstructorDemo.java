class Student {
    public int[] marks;

    public Student(int size) {
        marks = new int[size];
    }

    public void displayMarks() {
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}

public class ArrayConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student(3);

        s1.marks[0] = 89;
        s1.marks[1] = 76;
        s1.marks[2] = 99;

        s1.displayMarks();
    }
}
