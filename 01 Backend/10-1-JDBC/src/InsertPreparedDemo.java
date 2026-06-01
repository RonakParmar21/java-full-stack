import java.sql.*;

public class InsertPreparedDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystd", "root", "admin");

            String query = "INSERT INTO student(id,name,age) values (?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, 101);
            preparedStatement.setString(2, "Akshar");
            preparedStatement.setInt(3, 80);
            int update = preparedStatement.executeUpdate();

            System.out.println("Inserted : " + update + " rows.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
