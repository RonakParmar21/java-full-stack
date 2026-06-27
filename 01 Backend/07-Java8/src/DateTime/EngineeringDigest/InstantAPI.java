package DateTime.EngineeringDigest;

import java.time.Instant;

public class InstantAPI {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println(l);

        Instant now = Instant.now();
        System.out.println(now);

        // common methods also works here
    }
}
