package DateTime;

import java.time.LocalTime;

public class Program2_CurrentTime {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time is : " + currentTime);
    }
}
