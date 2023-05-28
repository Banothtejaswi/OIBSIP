import java.util.Scanner;

public class ReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Login form
        System.out.println("Welcome to the Online Reservation System!");
        System.out.print("Enter your login id: ");
        String loginId = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Reservation form
        System.out.println("Please fill in the following details to make a reservation:");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your train number: ");
        int trainNumber = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        System.out.print("Enter your class type: ");
        String classType = scanner.nextLine();
        System.out.print("Enter the date of journey: ");
        String dateOfJourney = scanner.nextLine();
        System.out.print("Enter the starting station: ");
        String startingStation = scanner.nextLine();
        System.out.print("Enter the destination station: ");
        String destinationStation = scanner.nextLine();

        // Insert data into the database
        insertReservationData(loginId, name, trainNumber, classType, dateOfJourney, startingStation, destinationStation);

        // Cancellation form
        System.out.print("Enter your PNR number to cancel your reservation: ");
        String pnrNumber = scanner.nextLine();
        if (confirmCancellation(pnrNumber)) {
            System.out.println("Your reservation has been cancelled.");
        } else {
            System.out.println("Cancellation failed.");
        }

        scanner.close();
    }

    // Method to insert reservation data into the database
    private static void insertReservationData(String loginId, String name, int trainNumber, String classType, String dateOfJourney, String startingStation, String destinationStation) {
        // TODO: Insert data into the database
        // This method would typically interact with a database to insert the reservation data.
        // For the purposes of this example, we'll just print out the data.
        System.out.println("Reservation details:");
        System.out.println("Login ID: " + loginId);
        System.out.println("Name: " + name);
        System.out.println("Train number: " + trainNumber);
        System.out.println("Class type: " + classType);
        System.out.println("Date of journey: " + dateOfJourney);
        System.out.println("Starting station: " + startingStation);
        System.out.println("Destination station: " + destinationStation);
    }

    // Method to confirm cancellation of a reservation
    private static boolean confirmCancellation(String pnrNumber) {
        // TODO: Check the database to confirm that the reservation with the given PNR number has been cancelled
        // This method would typically interact with a database to check if the reservation has been cancelled.
        // For the purposes of this example, we'll just return true.
        return true;
    }
}
