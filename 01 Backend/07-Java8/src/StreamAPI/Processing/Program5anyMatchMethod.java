package StreamAPI.Processing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program5anyMatchMethod {
    public static void main(String[] args) {
        List<Integer> listOfNum = Arrays.asList(22, 33, 44, 55, 66);
        boolean anyMatch = listOfNum.stream().anyMatch(i -> i == 221);
        System.out.println(anyMatch);
    }
}
