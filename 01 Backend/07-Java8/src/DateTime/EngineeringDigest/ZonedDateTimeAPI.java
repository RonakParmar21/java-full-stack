package DateTime.EngineeringDigest;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTimeAPI {
    public static void main(String[] args) {
        // ZonedDateTime and LocalDateTime both are same difference is with zone in ZonedDateTime
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        System.out.println("=====================");

        // zone ids
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        availableZoneIds.forEach(System.out::println);

        System.out.println("=====================");

        ZonedDateTime customZonedDateTime = ZonedDateTime.of(2000, 12, 1, 14, 30, 30, 30, ZoneId.of("America/New_York"));
        System.out.println(customZonedDateTime);

        System.out.println("=====================");

        // common methods are also use in ZonedDateTime
    }
}
