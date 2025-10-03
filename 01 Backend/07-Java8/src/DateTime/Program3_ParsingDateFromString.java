package DateTime;

import java.time.LocalDate;

public class Program3_ParsingDateFromString {
    public static void main(String[] args) {
        String dateString = "2025-10-04";
        LocalDate localDate = LocalDate.parse(dateString);
        System.out.println("Parsed date is : " + localDate);
    }
}
