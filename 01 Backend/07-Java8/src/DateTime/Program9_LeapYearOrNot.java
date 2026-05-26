package DateTime;

import java.time.Year;

public class Program9_LeapYearOrNot {
    public static void main(String[] args) {
        int	year = 2020;
        boolean	isLeapYear = Year.of(year).isLeap();
        System.out.println(year	+ "	is a leap year? " + isLeapYear);
    }
}
