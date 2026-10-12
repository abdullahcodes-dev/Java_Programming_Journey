class Book {
    public String title;
    public String author;

    public Book() {
        title = "Unknown";
        author = "Unknown";
    }

    public Book(String t, String a) {
        title = t;
        author = a;
    }

    public Book(String t) {
        title = t;
        author = "Unknown";
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.display();

        System.out.println();

        Book b2 = new Book("Clean Code", "Robert C. Martin");
        b2.display();

        System.out.println();

        Book b3 = new Book("Diary of a Wimpy Kid");
        b3.display();
    }
}
