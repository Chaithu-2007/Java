import java.util.Scanner;

public class Train_Ticket_Booking {

    static String seats[][] = new String[10][8];

    static void viewSeats() {
        System.out.println("\nTrain Seat Status:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Coach " + (i + 1) + ": ");

            for (int j = 0; j < 8; j++) {
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

        System.out.print("Enter Coach Number (1-10): ");
        int coach = sc.nextInt() - 1;

        System.out.print("Enter Seat Number (1-8): ");
        int seat = sc.nextInt() - 1;

        if (seats[coach][seat].equals("Available")) {
            seats[coach][seat] = "Booked";
            System.out.println("Train Ticket Booked Successfully.");
        } else {
            System.out.println("Seat Already Booked.");
        }

        viewSeats();
    }

    Train_Ticket_Booking() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                seats[i][j] = "Available";
            }
        }
    }

    public static void main(String[] args) {

        new Train_Ticket_Booking();

        Scanner sc = new Scanner(System.in);

        System.out.print("Want to Book Train Ticket (Yes/No): ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("Yes")) {
            viewSeats();
        } else {
            System.out.println("Thank You.");
        }
    }
}