class Ticket {
    private int ticketNo;
    private String customerName;
    private int seatNumber;

    public Ticket(int ticketNo, String customerName, int seatNo) {
        this.ticketNo = ticketNo;
        this.customerName = customerName;
        this.seatNumber = seatNo;
    }

    public int getTicketNo() {
        return ticketNo;
    }

    @Override
    public String toString() {
        return "Ticket No: " + ticketNo + ", Customer Name: " + customerName + ", Seat Number: " + seatNumber;
    }
}

class BookingSystem {
    private Ticket[] tickets = new Ticket[10]; // Maximum of 10 seats

    public boolean bookTicket(int ticketNumber, String customerName, int seatNumber) {
        if (seatNumber < 1 || seatNumber > 10) {
            System.out.println("Invalid seat number. Please choose a seat between 1 and 10.");
            return false;
        }
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i] == null) {
                tickets[i] = new Ticket(ticketNumber, customerName, seatNumber);
                System.out.println("Ticket booked successfully: " + tickets[i]);
                return true;
            }
        }
        System.out.println("No available seats.");
        return false;
    }

    public boolean cancelTicket(int ticketNo) {
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i] != null && tickets[i].getTicketNo() == ticketNo) {
                System.out.println("Cancelling ticket: " + tickets[i]);
                tickets[i] = null;
                return true;
            }
        }
        System.out.println("Ticket number " + ticketNo + " not found.");
        return false;
    }

    public void displayBookings() {
        System.out.println("\nCurrent Bookings:");
        for (Ticket ticket : tickets) {
            if (ticket != null) {
                System.out.println(ticket);
            }
        }
    }
}

public class Question4 {
    public static void main(String[] args) {
        BookingSystem system = new BookingSystem();

        system.bookTicket(1, "Kasun", 1);
        system.bookTicket(2, "Nuwan", 2);
        system.bookTicket(3, "Amal", 3);

        system.cancelTicket(2);
        system.bookTicket(4, "Supun", 2);

        // Display current bookings
        system.displayBookings();
    }
}
