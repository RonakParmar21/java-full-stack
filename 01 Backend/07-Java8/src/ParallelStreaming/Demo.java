package ParallelStreaming;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Yello");

        colors.parallelStream().forEach(System.out::println);

        List<Integer> list =
                Arrays.asList(1,2,3,4,5,6,7,8);

        list.parallelStream()
                .forEach(System.out::print);
    }
}
