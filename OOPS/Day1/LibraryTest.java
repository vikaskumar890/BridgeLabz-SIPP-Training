package OOPS.Day1;
class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {
        System.out.println("Title: " + title + ", Year: " + publicationYear);
        System.out.println("Author: " + name + ", Bio: " + bio);
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        Author a = new Author("Java Basics", 2021, "John Doe", "Tech writer and Java expert");
        a.displayInfo();
    }
}
