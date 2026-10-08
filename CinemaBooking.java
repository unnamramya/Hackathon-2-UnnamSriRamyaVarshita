import java.util.*;

class MovieTicket {
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

    public MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    public double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    public double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return ((ticketPrice * numberOfTickets) * 0.1);
        } else {
            return 0;
        }
    }

    public double calculateFinalAmount() {
        if (numberOfTickets >= 5) {
            return ((ticketPrice * numberOfTickets) - ((ticketPrice * numberOfTickets) * 0.1));
        } else {
            return (ticketPrice * numberOfTickets);
        }
    }

    public void displayBill() {
        System.out.println("Movie name: " + this.movieName);
        System.out.println("Ticket price: " + this.ticketPrice);
        System.out.println("Number of tickets: " + this.numberOfTickets);
        System.out.println("Discount: " + this.calculateDiscount());
        System.out.println("Final amount: " + this.calculateFinalAmount());
    }
}

public class CinemaBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the movie name: ");
        String movieName = scanner.nextLine();
        System.out.println("Enter the ticket price: ");
        double ticketPrice = scanner.nextInt();
        System.out.println("Enter the number of tickets: ");
        int numberOfTickets = scanner.nextInt();

        MovieTicket movieTicket = new MovieTicket(movieName, ticketPrice, numberOfTickets);
        movieTicket.displayBill();
    }
}