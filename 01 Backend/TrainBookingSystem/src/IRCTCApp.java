import java.util.List;
import java.util.Scanner;

public class IRCTCApp {
    private final Scanner scanner = new Scanner(System.in);
    private final UserSearvice userSearvice = new UserSearvice();
    private final BookingService bookingService = new BookingService();
    public static void main(String[] args) {
        new IRCTCApp().start();
    }

    public void start() {
        while (true) {
            System.out.println("\n----- Welcome to IRCTC APP -----");
            if(!userSearvice.isLoggedIn()) {
                System.out.println("1. Register");
                System.out.println("2. Login");
                System.out.println("3. Exit");
                System.out.print("4. Enter your choice : ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> register();
                    case 2 -> login();
                    case 3 -> exitApp();
                    default -> System.out.println("Invalid choice");
                }
            } else {
                showUserMenu();
            }
        }
    }

    public void register() {
        System.out.print("Enter username : ");
        String username = scanner.next();
        System.out.print("Enter password : ");
        String password = scanner.next();
        System.out.print("Enter full name : ");
        scanner.nextLine();
        String fullName = scanner.nextLine();
        System.out.print("Enter contact : ");
        String contact = scanner.next();

        userSearvice.registerUser(username, password, fullName, contact);
    }

    public void login() {
        System.out.print("Enter username : ");
        String username = scanner.next();
        System.out.print("Enter password : ");
        String password = scanner.next();

        userSearvice.loginuser(username, password);
    }

    public void exitApp() {
        System.out.println("Thank you for using IRCTC APP.");
        System.exit(0);
    }

    private void showUserMenu() {
        while (userSearvice.isLoggedIn()) {
            System.out.println("----- User Menu -----");
            System.out.println("1. Search Trains");
            System.out.println("2. Book Ticket");
            System.out.println("3. View My Tickets");
            System.out.println("4. Cancel Tickets");
            System.out.println("5. View All Trains");
            System.out.println("6. Logout");
            System.out.println("Enter your choice : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> searchTrain();
                case 2 -> bookTicket();
                case 3 -> viewMyTicket();
                case 4 -> cancelTicket();
                case 5 -> bookingService.listAllTrain();
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
        System.out.println("Trains found : ");
        for (Train train : trains) {
            System.out.println(train);
        }

        System.out.println("Do you want to book ticket?(yes/no)");
        String choice = scanner.next();
        if(choice.equalsIgnoreCase("yes")) {
            System.out.println("Enter train id to book : ");
            int trainID = scanner.nextInt();
            System.out.println("Enter no of seats to book : ");
            int seats = scanner.nextInt();

            Ticket ticket = bookingService.bookTicket(userSearvice.getCurrentUser(), trainID, seats);
            if(ticket != null) {
                System.out.println("Booking successful...");
                System.out.println(ticket);
            }
        } else {
            System.out.println("Returning to user menu.");
        }
    }

    private void bookTicket() {
        System.out.println("Enter source station : ");
        String source = scanner.next();
        System.out.println("Enter destination station : ");
        String destination = scanner.next();
        List<Train> trains = bookingService.searchTrain(source, destination);
        if(trains.isEmpty()) {
            System.out.println("No trains available for booking from " + source + " to " + destination);
            return;
        }
        System.out.println("Available Trains");
        for (Train train : trains) {
            System.out.println(train);
        }
        System.out.println("Enter train id to book : ");
        int trainID = scanner.nextInt();
        System.out.println("Enter no of seats to book : ");
        int seats = scanner.nextInt();

        Ticket ticket = bookingService.bookTicket(userSearvice.getCurrentUser(), trainID, seats);
        if(ticket != null) {
            System.out.println("Booking successful...");
            System.out.println(ticket);
        }
    }

    private void viewMyTicket() {
        List<Ticket> ticketByUser = bookingService.getTicketByUser(userSearvice.getCurrentUser());
        if(ticketByUser.isEmpty()) {
            System.out.println("No ticket booked yet..");
        } else {
            System.out.println("Your tickets.");
            for(Ticket ticket : ticketByUser) {
                System.out.println(ticket);
            }
        }
    }

    private void cancelTicket() {
        System.out.println("Enter ticket id to cancel : ");
        int ticketID = scanner.nextInt();

        bookingService.cancelTicket(ticketID, userSearvice.getCurrentUser());
    }
}

