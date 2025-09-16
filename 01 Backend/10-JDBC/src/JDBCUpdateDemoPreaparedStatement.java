import java.sql.*;
import java.util.Scanner;

public class JDBCUpdateDemoPreaparedStatement {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystd", "root", "admin");

            System.out.println("Enter student id : ");
            int studentId = sc.nextInt();
            System.out.println("Enter student name : ");
            String studentName = sc.next();
            System.out.println("Enter student age : ");
            int studentAge = sc.nextInt();

            String query = "update student set name = ?, age = ? where id = ?";
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, studentName);
            pst.setInt(2, studentAge);
            pst.setInt(3, studentId);
            int update = pst.executeUpdate();

            System.out.println("Updated " + update + " rows");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
