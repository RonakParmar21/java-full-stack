import java.sql.*;

public class JDBCInsertDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystd", "root", "admin");
            Statement statement = connection.createStatement();

            String query = "INSERT INTO student VALUES(12, 'Miki Maus', 20)";
            int update = statement.executeUpdate(query);

            System.out.println("Inserted : " + update + " rows.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
