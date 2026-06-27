package DateTime.EngineeringDigest;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateAPI {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now); // print yyyy-mm-dd

        LocalDate customDate = LocalDate.of(1990, 2, 7);
        System.out.println(customDate);
        System.out.println("=====================");

        int dayOfMonth = now.getDayOfMonth();
        Month month = now.getMonth();
        int monthValue = now.getMonthValue();
        int year = now.getYear();
        System.out.println("Day of month is : " + dayOfMonth); // 27
        System.out.println("Month is : " + month); // JUNE
        System.out.println("Get month value is : " + monthValue); // 6
        System.out.println("Year is : " + year); // 2026

        System.out.println("=====================");

        // I want yester day's date
        LocalDate yesterday = now.minusDays(1);
        System.out.println("Yesterday's date is : "+yesterday);
        // last 100 month ago's date
        LocalDate localDate1 = now.minusMonths(100);
        System.out.println("Last 100 month's ago's date is : " + localDate1);
        if (now.isAfter(yesterday)) System.out.println("Ha bhai!");

    }
}
