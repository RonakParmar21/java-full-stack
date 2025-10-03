package DateTime;

import java.time.LocalDate;

public class Program6_DateBeforeAndAfterFromAnotherDate {
    public static void main(String[] args) {
        LocalDate date1	= LocalDate.of(2023,7,24);
        LocalDate date2	= LocalDate.of(2023,12,31);
        System.out.println("Is date1 before	date2? " + date1.isBefore(date2));
        System.out.println("Is date1 after date2? " + date1.isAfter(date2));
    }
}
