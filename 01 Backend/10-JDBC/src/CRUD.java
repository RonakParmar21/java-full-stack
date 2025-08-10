import java.sql.*;
import java.util.Scanner;

public class CRUD {
    static Connection connection;
    static Statement statement;
    static PreparedStatement preparedStatement;
    static ResultSet resultSet;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystd", "root", "admin");
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        int id, age;
        String name;

        while (true) {

            System.out.println("Select any one operation : ");
            System.out.println("1. Insert student details - id, name, age : ");
            System.out.println("2. Select all student details : ");
            System.out.println("3. Update student details based on id : ");
            System.out.println("4. Delete student based on id : ");
            System.out.println("0. Exit : ");
            System.out.print("Choose any one operation : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student id : ");
                    id = scanner.nextInt();

                    System.out.print("Enter student name : ");
                    name = scanner.next();

                    System.out.print("Enter student age : ");
                    age = scanner.nextInt();

                    insertStudentDetails(id, name, age);
                    break;

                case 2:
                    System.out.println("----- All student details are -----");
                    selectAllStudentDetails();
                    break;

                case 3:
                    System.out.print("Enter student id which you want to update : ");
                    id = scanner.nextInt();

                    System.out.print("nEnter student name which you want to update : ");
                    name = scanner.next();

                    System.out.print("Enter student age which you want to update : ");
                    age = scanner.nextInt();

                    updateStudentDetails(id, name, age);
                    break;

                case 4:
                    System.out.print("Enter student id which you want to delete : ");
                    id = scanner.nextInt();

                    deleteStudent(id);
                    break;

                case 0:
                    exit();
                    break;

                default:
                    System.out.println("Enter valid choice...");
            }
        }
    }

    public static void insertStudentDetails(int id, String name, int age) {
        try {
            String insertStudentSql = "INSERT INTO student(id, name, age) VALUES(?,?,?)";
            preparedStatement = connection.prepareStatement(insertStudentSql);

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, age);

            int rows = preparedStatement.executeUpdate();

            if(rows > 0) {
                System.out.println("Record inserted successfully...");
                showUserMenu();
            } else {
                System.out.println("Failed to insert record...");
            }

        } catch (SQLException e) {
            System.out.println("Insert operation sql exception is : " + e);
        } catch (Exception e) {
            System.out.println("Insert operation exception is : " + e);
        }
    }

    public static void selectAllStudentDetails() {
        System.out.println("Select all student details...");

        try {

            String selectAllStudentQuery = "SELECT * FROM student";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(selectAllStudentQuery);

            if(resultSet == null)
                System.out.println("No records are found...");
            while (resultSet.next()) {
                System.out.println("Id is : " + resultSet.getInt("id") + " | Name is : " + resultSet.getString("name") + " | Age is : " + resultSet.getInt("age"));
            }

        } catch (SQLException e) {
            System.out.println("Select all student sql exception is : " + e);
        } catch (Exception e) {
            System.out.println("Select all student exception is : " + e);
        }

        showUserMenu();
    }

    public static void updateStudentDetails(int id, String name, int age) {
        System.out.println("Update student details");
        try {
            String updateStudentSql = "UPDATE student set name = ?, age = ? where id = ?";

            preparedStatement = connection.prepareStatement(updateStudentSql);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setInt(3, id);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Update student sql exception is : " + e);
        } catch (Exception e) {
            System.out.println("Update student exception is : " + e);
        }
        showUserMenu();
    }

    public static void deleteStudent(int id) {
        try {
            System.out.println();
            String deleteStudentSql = "DELETE FROM student WHERE id = ?";
            preparedStatement = connection.prepareStatement(deleteStudentSql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println(id + " deleted successfully.");
        } catch (SQLException e) {
            System.out.println("Delete student sql exception is : " + e);
        } catch (Exception e) {
            System.out.println("Delete student exception is : " + e);
        }
        showUserMenu();
    }

    public static void showUserMenu() {
        System.out.println();
        int id, age;
        String name;

        while (true) {
            System.out.println("Select any one operation : ");
            System.out.println("1. Insert student details - id, name, age : ");
            System.out.println("2. Select all student details : ");
            System.out.println("3. Update student details based on id : ");
            System.out.println("4. Delete student based on id : ");
            System.out.println("0. Exit : ");
            System.out.print("Choose any one operation : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student id : ");
                    id = scanner.nextInt();

                    System.out.print("Enter student name : ");
                    name = scanner.next();

                    System.out.print("Enter student age : ");
                    age = scanner.nextInt();

                    insertStudentDetails(id, name, age);
                    break;

                case 2:
                    System.out.println("----- All student details are -----");
                    selectAllStudentDetails();
                    break;

                case 3:
                    System.out.print("Enter student id which you want to update : ");
                    id = scanner.nextInt();

                    System.out.print("nEnter student name which you want to update : ");
                    name = scanner.next();

                    System.out.print("Enter student age which you want to update : ");
                    age = scanner.nextInt();

                    updateStudentDetails(id, name, age);
                    break;

                case 4:
                    System.out.print("Enter student id which you want to delete : ");
                    id = scanner.nextInt();

                    deleteStudent(id);
                    break;

                case 0:
                    exit();
                    break;

                default:
                    System.out.println("Enter valid choice...");
            }
        }
    }

    public static void exit() {
        System.exit(0);
    }
}
