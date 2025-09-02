package StreamAPI.Processing;

import java.util.stream.Stream;

public class Program2countMethod {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 6);
        long count = s.count();
        System.out.println(count);
    }
}
