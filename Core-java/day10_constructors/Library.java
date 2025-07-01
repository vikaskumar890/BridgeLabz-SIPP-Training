public class Library {

    private String title;
    private String author;
    private double price;
    private boolean available;

    public Library(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is currently not available.");
        }
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Library book = new Library("Clean Code", "Robert C. Martin", 799.0);

        System.out.println("=== Book Details ===");
        book.displayDetails();

        System.out.println("\n=== Borrowing Book ===");
        book.borrowBook();

        System.out.println("\n=== Book Details After Borrowing ===");
        book.displayDetails();

        System.out.println("\n=== Trying to Borrow Again ===");
        book.borrowBook();
    }
}
