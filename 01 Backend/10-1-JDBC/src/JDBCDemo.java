import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class JDBCDemo {
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
            Statement statement = con.createStatement();

            // step 4 :- execute query.
            String query = "select * from student";

            ResultSet resultSet = statement.executeQuery(query);

            System.out.println("Student ID\tStudent name \t Age");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + "\t\t\t" + resultSet.getString(2));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
