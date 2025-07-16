package DSA.Day2;
class Movie {
    String title;
    String director;
    int year;
    double rating;
    Movie prev, next;

    Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}

class MovieList {
    Movie head, tail;

    void addAtBeginning(Movie movie) {
        if (head == null) {
            head = tail = movie;
        } else {
            movie.next = head;
            head.prev = movie;
            head = movie;
        }
    }

    void addAtEnd(Movie movie) {
        if (tail == null) {
            head = tail = movie;
        } else {
            tail.next = movie;
            movie.prev = tail;
            tail = movie;
        }
    }

    void addAtPosition(Movie movie, int position) {
        if (position <= 0 || head == null) {
            addAtBeginning(movie);
            return;
        }
        Movie temp = head;
        for (int i = 1; i < position && temp.next != null; i++) {
            temp = temp.next;
        }
        if (temp.next == null) {
            addAtEnd(movie);
        } else {
            movie.next = temp.next;
            movie.prev = temp;
            temp.next.prev = movie;
            temp.next = movie;
        }
    }

    void removeByTitle(String title) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
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

    void searchByDirector(String director) {
        Movie temp = head;
        while (temp != null) {
            if (temp.director.equals(director)) {
                System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            }
            temp = temp.next;
        }
    }

    void searchByRating(double rating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.rating == rating) {
                System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            }
            temp = temp.next;
        }
    }

    void updateRating(String title, double newRating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.rating = newRating;
                break;
            }
            temp = temp.next;
        }
    }

    void displayForward() {
        Movie temp = head;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            temp = temp.next;
        }
    }

    void displayReverse() {
        Movie temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            temp = temp.prev;
        }
    }
}

public class MovieManagementSystem {
    public static void main(String[] args) {
        MovieList list = new MovieList();
        list.addAtEnd(new Movie("Inception", "Nolan", 2010, 9.0));
        list.addAtBeginning(new Movie("Avatar", "Cameron", 2009, 8.5));
        list.addAtPosition(new Movie("Interstellar", "Nolan", 2014, 9.1), 1);
        list.displayForward();
        list.updateRating("Avatar", 8.8);
        list.removeByTitle("Inception");
        list.displayReverse();
        list.searchByDirector("Nolan");
        list.searchByRating(8.8);
    }
}

