import java.sql.*;
import java.util.Scanner;

public class JDBCDeletePreparedStatement {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystd", "root", "admin");

            System.out.println("Enter student id which you want to delete : ");
            int studentId = sc.nextInt();

            String query = "delete from student where id = ?";
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setInt(1, studentId);
            int update = pst.executeUpdate();

            System.out.println("Deleted " + update + " rows");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
