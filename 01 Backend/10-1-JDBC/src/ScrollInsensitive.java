import java.sql.*;

public class ScrollInsensitive {

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
            System.out.println("Scroll insensitive & concur_read_only");

            resultSet.last();
            System.out.println("Last Row : " + resultSet.getInt(1) + " | " + resultSet.getString(2));

            resultSet.first();
            System.out.println("First Row : " + resultSet.getInt(1) + " | " + resultSet.getString(2));

            resultSet.absolute(2);
            System.out.println("Custom Row : " + resultSet.getInt(1) + " | " + resultSet.getString(2));
//            while (resultSet.next()) {
//                System.out.println(resultSet.getInt(1) + "\t\t\t" + resultSet.getString(2));
//            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
