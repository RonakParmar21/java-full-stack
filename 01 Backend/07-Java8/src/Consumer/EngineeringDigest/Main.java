package Consumer.EngineeringDigest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Ronak");

        Consumer<List<Integer>> listConsumer = li -> {
            for (Integer i : li) System.out.println(i + 100);
        };
        listConsumer.accept(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("-----------------------------------");

        Consumer<List<Integer>> listConsumer1 = li -> {
            for (Integer i : li) System.out.println(i);
        };
        listConsumer1.andThen(listConsumer).accept(Arrays.asList(1, 2, 3, 4, 5));
    }
}
