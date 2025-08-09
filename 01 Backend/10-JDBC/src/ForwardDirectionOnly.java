import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ForwardDirectionOnly {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystd", "root", "admin");
            Statement statement = con.createStatement();
            String query = "select * from student"; // it is a string not query.
            ResultSet rs = statement.executeQuery(query);
            System.out.println("----- Reading Data -----");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getInt("age")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
