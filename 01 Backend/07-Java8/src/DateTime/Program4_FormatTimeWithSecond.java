package DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Program4_FormatTimeWithSecond {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(12, 24, 56);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formatedTime = localTime.format(dateTimeFormatter);
        System.out.println("Formatted time is : " + formatedTime);
    }
}
