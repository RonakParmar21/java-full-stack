package DateTime;

import java.time.LocalDate;

public class Program1_CurrentDate {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date is : " + currentDate);
    }
}
