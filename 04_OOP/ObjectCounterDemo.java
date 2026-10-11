class Book {
    public static int count = 0;

    public Book() {
        count++;
    }

    public static void displayCount(){
        System.out.println("Current Count: " + count);
    }
}

public class ObjectCounterDemo {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();

        Book.displayCount();
    }
}
