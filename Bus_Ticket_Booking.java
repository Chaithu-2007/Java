import java.util.Scanner;

public class Bus_Ticket_Booking {

    static String seats[][] = new String[5][4];

    static void viewSeats() {
        System.out.println("\nBus Seat Status:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(seats[i][j] + "  ");
            }
            System.out.println("\n");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Want to book a ticket (Yes/No): ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("Yes")) {
            bookTicket();
        } else {
            System.out.println("Thank You for Visiting.");
        }
    }

    static void bookTicket() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Row (1-5): ");
        int row = sc.nextInt() - 1;

        System.out.print("Enter Seat (1-4): ");
        int col = sc.nextInt() - 1;

        if (seats[row][col].equals("Available")) {
            seats[row][col] = "Booked";
            System.out.println("Ticket Booked Successfully.");
        } else {
            System.out.println("Seat Already Booked.");
        }

        viewSeats();
    }

    Bus_Ticket_Booking() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                seats[i][j] = "Available";
            }
        }
    }

    public static void main(String[] args) {

        new Bus_Ticket_Booking();

        Scanner sc = new Scanner(System.in);

        System.out.print("Want to Book Bus Ticket (Yes/No): ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("Yes")) {
            viewSeats();
        } else {
            System.out.println("Thank You.");
        }
    }
}