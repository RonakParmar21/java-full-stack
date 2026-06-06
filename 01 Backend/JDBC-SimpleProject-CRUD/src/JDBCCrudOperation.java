import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class JDBCCrudOperation {

    private static Connection connection;

    public static Connection getConnection() {

        try {

            if(connection == null || connection.isClosed()) {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mystd", "", "admin");


            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }

    public void addStudent() {
        System.out.println("Student Added...");
    }

    public void showStudents() {
        System.out.println("All Students...");
    }

    public void showStudentById() {
        System.out.println("Students by id...");
    }

    public void deleteAllStudents() {
        System.out.println("Delete all students...");
    }

    public void deleteStudentById() {
        System.out.println("Delete students by id...");
    }

    public void updateStudent() {
        System.out.println("Update students...");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JDBCCrudOperation jdbcCrudOperation = new JDBCCrudOperation();

        while (true) {
            System.out.println("\n\n----- User Menu -----");
            System.out.println("1. Add Student");
            System.out.println("2. Show Students");
            System.out.println("3. Show Students By Id");
            System.out.println("4. Delete Student");
            System.out.println("5. Delete All Student");
            System.out.println("6. Update Student");
            System.out.println("0. Exit");

            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> jdbcCrudOperation.addStudent();
                case 2 -> jdbcCrudOperation.showStudents();
                case 3 -> jdbcCrudOperation.showStudentById();
                case 4 -> jdbcCrudOperation.deleteAllStudents();
                case 5 -> jdbcCrudOperation.deleteStudentById();
                case 6 -> jdbcCrudOperation.updateStudent();
                case 0 -> System.exit(0);
                default -> System.out.println("Invalid Input...");
            }
        }
    }
}
