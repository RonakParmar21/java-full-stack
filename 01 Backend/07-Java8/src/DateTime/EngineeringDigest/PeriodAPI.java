package DateTime.EngineeringDigest;

import java.time.LocalDate;
import java.time.Period;

/*
- Periods work with big dates
 */

public class PeriodAPI {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate then = LocalDate.of(1990, 2, 2);
        Period between = Period.between(now, then);
        System.out.println(between);
    }
}
