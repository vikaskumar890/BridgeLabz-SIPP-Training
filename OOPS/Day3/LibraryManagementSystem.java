package OOPS.Day3;
interface Reservable {
    void reserveItem(String userName);
    boolean checkAvailability();
}

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }

    public abstract int getLoanDuration();
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }

    public void reserveItem(String userName) {
        available = false;
        System.out.println("Book reserved by " + userName);
    }

    public boolean checkAvailability() {
        return available;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean available = true;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }

    public void reserveItem(String userName) {
        available = false;
        System.out.println("Magazine reserved by " + userName);
    }

    public boolean checkAvailability() {
        return available;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean available = true;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 3;
    }

    public void reserveItem(String userName) {
        available = false;
        System.out.println("DVD reserved by " + userName);
    }

    public boolean checkAvailability() {
        return available;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book("B101", "Java Basics", "Sunil"),
            new Magazine("M201", "Tech Today", "Editorial Board"),
            new DVD("D301", "Inception", "Nolan")
        };

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            Reservable res = (Reservable) item;
            if (res.checkAvailability()) {
                res.reserveItem("StudentA");
            } else {
                System.out.println("Not Available for reservation.");
            }

            System.out.println("Available? " + res.checkAvailability());
            System.out.println("------------------------");
        }
    }
}

