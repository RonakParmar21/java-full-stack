package StreamAPI.Processing;

import java.util.stream.Stream;

public class Program1toArrayMethod {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 6);
        Object[] array = s.toArray();
        for (Object a : array) {
            System.out.print(a + " ");
        }
    }
}
