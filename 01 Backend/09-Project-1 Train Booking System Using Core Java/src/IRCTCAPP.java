import java.util.List;
import java.util.Scanner;

public class IRCTCAPP {

    private final Scanner scanner = new Scanner(System.in);
    private final UserSearvice userSearvice = new UserSearvice();
    private final BookingService bookingService = new BookingService();

    public static void main(String[] args) {
        new IRCTCAPP().start();
    }

    public void start() {
        while (true) {
            System.out.println("\n----- Welcome to IRCTC App ----- ");
            if(!userSearvice.isLoggedIn()) {
                System.out.println("1. Register : ");
                System.out.println("2. Login : ");
                System.out.println("3. Exit : ");
                System.out.println("4. Enter your choice : ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> register();
                    case 2 -> login();
                    case 3 -> exitApp();
                    default -> System.out.println("Invalid choice.");
                }
            } else {
                showUserMenu();
            }
        }
    }

    public void register() {
        System.out.println("Enter user name : ");
        String userName = scanner.next();

        System.out.println("Enter user password : ");
        String userPassword = scanner.next();

        System.out.println("Enter user full name : ");
        scanner.nextLine();
        String userFullName = scanner.nextLine();

        System.out.println("Enter user contact : ");
        String userContact = scanner.next();

        userSearvice.registerUser(userName, userPassword, userFullName, userContact);
        userSearvice.loginUser(userName, userPassword);
    }

    public void login() {
        System.out.println("Enter user name : ");
        String userName = scanner.next();

        System.out.println("Enter user password : ");
        String userPassword = scanner.next();

        userSearvice.loginUser(userName, userPassword);
    }

    private void showUserMenu() {
        while (userSearvice.isLoggedIn()) {
            System.out.println("\n----- User Menu -----");
            System.out.println("1. Search Train : ");
            System.out.println("2. Booked Ticket : ");
            System.out.println("3. View My Ticket : ");
            System.out.println("4. Cancel Ticket : ");
            System.out.println("5. View All Trains : ");
            System.out.println("6. Logout : ");
            System.out.println("Enter choice : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> searchTrain();
                case 2 -> bookTicket();
                case 3 -> viewMyTicket();
                case 4 -> cancelTicket();
                case 5 -> bookingService.listAllTrains();
                case 6 -> userSearvice.logoutUser();
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private void searchTrain() {
        System.out.println("Enter source station : ");
        String source = scanner.next();

        System.out.println("Enter destination station : ");
        String destination = scanner.next();

        List<Train> trains = bookingService.searchTrain(source, destination);
        if(trains.isEmpty()) {
            System.out.println("No trains found between " + source + " and " + destination);
            return;
        }

        System.out.println("Train found.");
        for (Train train : trains) {
            System.out.println(train);
        }

        System.out.println("Do you want to book ticket? (yes or no)");
        String choice = scanner.next();
        if(choice.equalsIgnoreCase("yes")) {
            System.out.println("Enter train id to book : ");
            int trainId = scanner.nextInt();

            System.out.println("Enter number of seats to book : ");
            int seats = scanner.nextInt();

            Ticket ticket = bookingService.bookTicket(userSearvice.getCurrentUser(), trainId, seats);
            if(ticket != null) {
                System.out.println("Booking successfull.");
                System.out.println(ticket);
            }
        } else {
            System.out.println("Returning to user menu...");
        }
    }

    private void bookTicket() {
        System.out.println("Enter source station : ");
        String source = scanner.next();

        System.out.println("Enter destination station : ");
        String destination = scanner.next();

        List<Train> trains = bookingService.searchTrain(source, destination);
        if(trains.isEmpty()) {
            System.out.println("No trains available for booking");
            return;
        }

        System.out.println("Available Trains");
        for(Train train : trains) {
            System.out.println(train);
        }

        System.out.println("Enter train id to book : ");
        int trainId = scanner.nextInt();

        System.out.println("Enter number of seats to book : ");
        int seats = scanner.nextInt();

        Ticket ticket = bookingService.bookTicket(userSearvice.getCurrentUser(), trainId, seats);
        if(ticket != null) {
            System.out.println("Booking successfull.");
            System.out.println(ticket);
        }
    }

    private void viewMyTicket() {
        List<Ticket> ticketByUser = bookingService.getTicketByUser(userSearvice.getCurrentUser());
        if(ticketByUser.isEmpty()) {
            System.out.println("No ticket found.");
        } else {
            System.out.println("Your tickets : ");
            for (Ticket ticket : ticketByUser) {
                System.out.println(ticket);
            }
        }
    }

    private void cancelTicket() {
        System.out.println("Enter ticket id to cancel : ");
        int ticketId = scanner.nextInt();

        bookingService.cancelTicket(ticketId, userSearvice.getCurrentUser());
    }

    private void exitApp() {
        System.out.println("Thank you for using IRCTC App.");
        System.exit(0);
    }
}
