import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollInsensitive {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystd", "root", "admin");
            Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String query = "select * from student"; // it is a string not query.

            ResultSet rs = statement.executeQuery(query);
            System.out.println("Scroll insensitive | read only");

            rs.last();
            System.out.println("Last Row : " + rs.getInt("id"));
            System.out.println("Last Row : " + rs.getString("name"));
            System.out.println("Last Row : " + rs.getInt("age"));

            rs.first();
            System.out.println("First Row : " + rs.getInt("id"));
            System.out.println("First Row : " + rs.getString("name"));
            System.out.println("First Row : " + rs.getInt("age"));

            rs.absolute(3);
            System.out.println("3rd Row : " + rs.getInt("id"));
            System.out.println("3rd Row : " + rs.getString("name"));
            System.out.println("3rd Row : " + rs.getInt("age"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
