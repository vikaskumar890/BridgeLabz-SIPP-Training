public class MovieTicket {

    private String movieName;
    private String seatNumber;
    private double price;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Avengers: Endgame");
        MovieTicket ticket2 = new MovieTicket("Interstellar");

        System.out.println("=== Booking Ticket 1 ===");
        ticket1.bookTicket("A10", 250);
        ticket1.displayTicketDetails();

        System.out.println("\n=== Booking Ticket 2 ===");
        ticket2.bookTicket("B5", 300);
        ticket2.displayTicketDetails();
    }
}
