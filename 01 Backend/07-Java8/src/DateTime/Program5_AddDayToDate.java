package DateTime;

import java.time.LocalDate;

public class Program5_AddDayToDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate futureDate = localDate.plusDays(10);
        System.out.println("Future date is : " + futureDate);
    }
}
