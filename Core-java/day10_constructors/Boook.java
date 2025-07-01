public class Boook {

    public String isbn;
    protected String title;
    private String author;

    public Boook(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void displayBookInfo() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Boook {

    private String fileFormat;

    public EBook(String isbn, String title, String author, String fileFormat) {
        super(isbn, title, author);
        this.fileFormat = fileFormat;
    }

    public void displayEBookInfo() {
        System.out.println("Accessing Public ISBN: " + isbn);
        System.out.println("Accessing Protected Title: " + title);
        System.out.println("EBook Format: " + fileFormat);
    }

    public static void main(String[] args) {
        EBook ebook = new EBook("978-0134685991", "Effective Java", "Joshua Bloch", "PDF");

        System.out.println("=== Book Info ===");
        ebook.displayBookInfo();

        System.out.println("\n=== EBook Extra Info ===");
        ebook.displayEBookInfo();

        System.out.println("\nUpdating Author...");
        ebook.setAuthor("J. Bloch");
        ebook.displayBookInfo();
    }
}
