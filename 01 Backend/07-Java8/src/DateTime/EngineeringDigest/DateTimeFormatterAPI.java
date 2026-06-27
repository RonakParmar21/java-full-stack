package DateTime.EngineeringDigest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterAPI {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("2023-04-24");
        System.out.println(localDate);

        System.out.println("======================");

        LocalDate localDate1 = LocalDate.now();
        String date = "25/04/1998";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parse = LocalDate.parse(date, dateTimeFormatter);
        System.out.println(parse);
    }
}
