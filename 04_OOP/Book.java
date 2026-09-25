public class Book {
    public String title;
    public String author;
    public boolean issueStatus;

    public void issueBook() {
        issueStatus = true;
        System.out.println("Book issued successfully!");
    }

    public void returnBook() {
        issueStatus = false;
        System.out.println("Book returned successfully!");
    }

    public void display() {
        System.out.println("Book Name: " + title);
        System.out.println("Author: " + author);
        System.out.println("Issue Status: " + issueStatus);
    }

    public static void main(String[] args) {
        Book b1 = new Book();

        b1.title = "Diary of a Wimpy Kid";
        b1.author = "Jeff Kinney";

        b1.issueBook();
        b1.display();

        System.out.println();

        b1.returnBook();
        b1.display();
    }
}
