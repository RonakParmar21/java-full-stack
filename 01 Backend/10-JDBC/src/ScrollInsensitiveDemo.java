import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollInsensitiveDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystd", "root", "admin");
            Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String query = "select * from student"; // it is a string not query.

            ResultSet rs = statement.executeQuery(query);
            System.out.println("Fetch data in not live update mode...");

            Thread.sleep(10000);
            rs.beforeFirst();

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getInt("age")
                );
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
