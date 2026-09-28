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

    public void display() {
        System.out.println("Book Name: " + title);
        System.out.println("Author: " + author);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Book b1 = new Book();

        b1.title = "Horrid Henry";
        b1.author = "Francesca Simon";

        b1.display();

        System.out.println();

        Book b2 = new Book("Diary of a Wimpy Kid", "Jeff Kinney");

        b2.display();
    }
}
