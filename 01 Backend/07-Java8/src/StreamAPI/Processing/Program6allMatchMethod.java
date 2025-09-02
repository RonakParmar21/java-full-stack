package StreamAPI.Processing;

import java.util.Arrays;
import java.util.List;

public class Program6allMatchMethod {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(22, 33, 44, 55, 66);
        boolean allMatch1 = list.stream().allMatch(s -> s % 2 == 0);
        boolean allMatch2 = list.stream().allMatch(s -> s > 10);
        System.out.println(allMatch1);
        System.out.println(allMatch2);
    }
}
