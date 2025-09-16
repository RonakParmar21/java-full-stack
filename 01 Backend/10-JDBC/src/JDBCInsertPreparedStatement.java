import java.sql.*;
import java.util.Scanner;

public class JDBCInsertPreparedStatement {
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

            String query = "insert into student(id, name, age) values(?, ?, ?)";
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setInt(1, studentId);
            pst.setString(2, studentName);
            pst.setInt(3, studentAge);

            int update = pst.executeUpdate();

            System.out.println("Inserted " + update + " rows");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
