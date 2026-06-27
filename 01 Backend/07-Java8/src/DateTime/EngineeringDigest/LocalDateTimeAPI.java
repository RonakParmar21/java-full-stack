package DateTime.EngineeringDigest;

import java.time.LocalDateTime;

public class LocalDateTimeAPI {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // all operations in LocalDate and LocalTime can work in LocalDateTime
    }
}
