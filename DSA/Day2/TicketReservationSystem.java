package DSA.Day2;
class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Ticket next;

    Ticket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
    }
}

class TicketSystem {
    Ticket head = null;
    Ticket tail = null;

    void addTicket(Ticket ticket) {
        if (head == null) {
            head = tail = ticket;
            ticket.next = ticket;
        } else {
            tail.next = ticket;
            ticket.next = head;
            tail = ticket;
        }
    }

    void removeTicket(int ticketId) {
        if (head == null) return;

        Ticket temp = head, prev = tail;

        do {
            if (temp.ticketId == ticketId) {
                if (temp == head && temp == tail) {
                    head = tail = null;
                    return;
                } else if (temp == head) {
                    head = head.next;
                    tail.next = head;
                } else if (temp == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    void displayTickets() {
        if (head == null) return;
        Ticket temp = head;
        do {
            System.out.println(temp.ticketId + " " + temp.customerName + " " + temp.movieName + " " + temp.seatNumber + " " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    void searchByCustomer(String name) {
        if (head == null) return;
        Ticket temp = head;
        do {
            if (temp.customerName.equalsIgnoreCase(name)) {
                System.out.println(temp.ticketId + " " + temp.customerName + " " + temp.movieName + " " + temp.seatNumber + " " + temp.bookingTime);
            }
            temp = temp.next;
        } while (temp != head);
    }

    void searchByMovie(String movie) {
        if (head == null) return;
        Ticket temp = head;
        do {
            if (temp.movieName.equalsIgnoreCase(movie)) {
                System.out.println(temp.ticketId + " " + temp.customerName + " " + temp.movieName + " " + temp.seatNumber + " " + temp.bookingTime);
            }
            temp = temp.next;
        } while (temp != head);
    }

    int totalTickets() {
        if (head == null) return 0;
        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }
}

public class TicketReservationSystem {
    public static void main(String[] args) {
        TicketSystem system = new TicketSystem();
        system.addTicket(new Ticket(1, "Alice", "Inception", "A1", "2025-07-16 10:00"));
        system.addTicket(new Ticket(2, "Bob", "Interstellar", "B2", "2025-07-16 11:00"));
        system.addTicket(new Ticket(3, "Alice", "Inception", "A2", "2025-07-16 10:05"));
        system.displayTickets();
        system.searchByCustomer("Alice");
        system.searchByMovie("Interstellar");
        System.out.println("Total Tickets: " + system.totalTickets());
        system.removeTicket(2);
        system.displayTickets();
    }
}

