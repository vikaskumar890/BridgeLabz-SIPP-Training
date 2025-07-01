public class Book {

    private String title;
    private String author;
    private final String isbn;
    private static String libraryName = "City Central Library";

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Library: " + libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling", "ISBN001");
        Book b2 = new Book("Python Essentials", "Guido van Rossum", "ISBN002");

        b1.displayBookDetails();
        System.out.println();
        b2.displayBookDetails();
        System.out.println();
        Book.displayLibraryName();
    }
}
