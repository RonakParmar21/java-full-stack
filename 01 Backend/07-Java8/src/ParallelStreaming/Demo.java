package ParallelStreaming;

import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Yello");

        colors.parallelStream().forEach(System.out::println);
    }
}
