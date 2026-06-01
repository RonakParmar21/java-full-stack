import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollInsensitiveDemo {

    /*
    step 1 :- load driver class.
    step 2 :- get connection from db.
    step 3 :- create statement.
    step 4 :- execute query.
     */
    public static void main(String[] args) {
        try {
            // step 1 :- load driver class.
            Class.forName("com.mysql.cj.jdbc.Driver");

            // step 2 :- get connection from db.
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystd", "root", "admin");

            // step 3 :- create statement.
            Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            // CONCUR_READ_ONLY :- DOES NOT REFLECT CHANGES WHILE FETCHING DATA

            // step 4 :- execute query.
            String query = "select * from student";
            ResultSet resultSet = statement.executeQuery(query);
            System.out.println("Fetch data live update mode...");

            Thread.sleep(10000);
            resultSet.beforeFirst();

            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " | " + resultSet.getString(2) + " | " + resultSet.getInt(3));
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
