class Book {
    public Book() {
        System.out.println("Book constructor called");
    }
}

public class ConstructorCallDemo {
    public static void main (String[] args) {
        System.out.println("Main started");

        Book b1 = new Book();

        Book b2 = new Book();

        System.out.println("Main ended");
    }
}
