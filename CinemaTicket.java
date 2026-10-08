import java.util.Scanner;
class MovieTicket {
    String moviename;
    double ticketprice;
    int numberoftickets;
    MovieTicket(String moviename, double ticketprice, int numberoftickets) {
        this.moviename = moviename;
        this.ticketprice = ticketprice;
        this.numberoftickets = numberoftickets;
    }
    double calculateTotal() {
        return ticketprice * numberoftickets;
    }
    double calculateDiscount() {
        double total = calculateTotal();
        if (numberoftickets >= 5) {
            return total * 0.1; 
        }
        return 0;
    }
    double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }
    void displayBill() {
        System.out.println("Movie Name: " + moviename);
        System.out.println("Ticket Price: " + ticketprice);
        System.out.println("Number of Tickets: " + numberoftickets);
        System.out.println("Discount: " + calculateDiscount());
        System.out.println("Final Amount to Pay: " + calculateFinalAmount());
    }
}
    public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Movie Name: ");
        String moviename = scanner.nextLine();
        System.out.print("Enter Ticket Price: ");
        double ticketprice = scanner.nextDouble();
        System.out.print("Enter Number of Tickets: ");
        int numberoftickets = scanner.nextInt();
        
        MovieTicket ticket = new MovieTicket(moviename, ticketprice, numberoftickets);
        ticket.displayBill();
        
        scanner.close();
    }
}


