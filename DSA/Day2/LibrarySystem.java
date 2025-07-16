package DSA.Day2;
class Book {
    String title;
    String author;
    String genre;
    int id;
    boolean available;
    Book prev, next;

    Book(String title, String author, String genre, int id, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.id = id;
        this.available = available;
    }
}

class Library {
    Book head, tail;

    void addAtBeginning(Book book) {
        if (head == null) {
            head = tail = book;
        } else {
            book.next = head;
            head.prev = book;
            head = book;
        }
    }

    void addAtEnd(Book book) {
        if (tail == null) {
            head = tail = book;
        } else {
            tail.next = book;
            book.prev = tail;
            tail = book;
        }
    }

    void addAtPosition(Book book, int position) {
        if (position <= 0 || head == null) {
            addAtBeginning(book);
            return;
        }
        Book temp = head;
        for (int i = 1; i < position && temp.next != null; i++) {
            temp = temp.next;
        }
        if (temp.next == null) {
            addAtEnd(book);
        } else {
            book.next = temp.next;
            book.prev = temp;
            temp.next.prev = book;
            temp.next = book;
        }
    }

    void removeById(int id) {
        Book temp = head;
        while (temp != null) {
            if (temp.id == id) {
                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    if (tail != null) tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                break;
            }
            temp = temp.next;
        }
    }

    void searchByTitle(String title) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                System.out.println(temp.title + " " + temp.author + " " + temp.genre + " " + temp.id + " " + temp.available);
            }
            temp = temp.next;
        }
    }

    void searchByAuthor(String author) {
        Book temp = head;
        while (temp != null) {
            if (temp.author.equals(author)) {
                System.out.println(temp.title + " " + temp.author + " " + temp.genre + " " + temp.id + " " + temp.available);
            }
            temp = temp.next;
        }
    }

    void updateAvailability(int id, boolean status) {
        Book temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.available = status;
                break;
            }
            temp = temp.next;
        }
    }

    void displayForward() {
        Book temp = head;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.author + " " + temp.genre + " " + temp.id + " " + temp.available);
            temp = temp.next;
        }
    }

    void displayReverse() {
        Book temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.author + " " + temp.genre + " " + temp.id + " " + temp.available);
            temp = temp.prev;
        }
    }

    int countBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addAtEnd(new Book("Book A", "Author X", "Fiction", 1, true));
        lib.addAtBeginning(new Book("Book B", "Author Y", "Sci-Fi", 2, false));
        lib.addAtPosition(new Book("Book C", "Author X", "Drama", 3, true), 1);
        lib.displayForward();
        lib.updateAvailability(2, true);
        lib.removeById(1);
        lib.displayReverse();
        lib.searchByAuthor("Author X");
        System.out.println("Total Books: " + lib.countBooks());
    }
}
