package StreamAPI.Processing;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.stream.Stream;

public class Program4minAndmaxMethod {
    public static void main(String[] args) {
        Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5, 6);
        Stream<Integer> s2 = Stream.of(1, 2, 3, 4, 5, 6);
        Optional<Integer> min = s1.min(((o1, o2) -> o1.compareTo(o2)));
        Optional<Integer> max = s2.max(((o1, o2) -> o1.compareTo(o2)));
        System.out.println("Min value is : " + min.get());
        System.out.println("Max value is : " + max.get());

        //
    }
}
