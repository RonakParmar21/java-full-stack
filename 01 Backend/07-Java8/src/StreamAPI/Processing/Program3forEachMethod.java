package StreamAPI.Processing;

import java.util.stream.Stream;

public class Program3forEachMethod {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 6);
        s.forEach(elem -> System.out.print(elem + " "));
    }
}
