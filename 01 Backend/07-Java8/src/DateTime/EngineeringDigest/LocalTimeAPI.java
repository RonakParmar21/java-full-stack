package DateTime.EngineeringDigest;

import java.time.LocalTime;

public class LocalTimeAPI {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        // custom time
        LocalTime localTime = LocalTime.of(14, 30);
        System.out.println(localTime);

        // string to time
        String timeInString = "15:30:45";
        LocalTime parse = LocalTime.parse(timeInString);
        System.out.println(parse);

        // minus
        LocalTime beforeOneHour = now.minusHours(1);
        System.out.println(beforeOneHour);

        if(now.isAfter(beforeOneHour)) System.out.println("Ha bhai!");

    }
}
