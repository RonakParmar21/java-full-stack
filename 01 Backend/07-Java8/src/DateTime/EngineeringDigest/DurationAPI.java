package DateTime.EngineeringDigest;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

/*
- Duration works with seconds not big date
 */

public class DurationAPI {
    public static void main(String[] args) {
        Instant start = Instant.now();
        Instant end = Instant.now();

//        Duration between = Duration.between(start, end);
//        System.out.println(between);

        int sum = 0;

        for (int i = 0; i < 100000; i++)
            sum += i + 1;

        Duration d1 = Duration.between(start, end);
        Duration d2 = Duration.of(1, ChronoUnit.MILLIS);
        System.out.println("D1 is : " + d1);
        System.out.println("D2 is : " + d2);
        int i = d1.compareTo(d2);
        System.out.println(i);
    }
}
