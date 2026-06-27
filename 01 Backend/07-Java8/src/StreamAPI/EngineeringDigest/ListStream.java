package StreamAPI.EngineeringDigest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 45, 5, 6, 63, 0, 1, 16, 346, 34, 23, 1, 3, 53, 35, 35, 53, 35);

        // find even element from list
        List<Integer> filteredList = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(filteredList);

        List<Integer> mappedList = filteredList.stream().map(n -> n / 2).collect(Collectors.toList());
        System.out.println(mappedList);

        // above both operations use this
        List<Integer> bestApproachList = list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n / 2)
                .distinct()
                .sorted((a, b) -> b - a)
                .limit(4)
                .skip(2)
                .collect(Collectors.toList());
        System.out.println(bestApproachList);

        List<Integer> collect = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .skip(1)
                .filter(n -> n % 2 == 0)
                .map(x -> x / 10)
                .distinct()
                .sorted()
                .peek(System.out::println)
                .toList();
        System.out.println("Collect is : " + collect);
        System.out.println("====");
        Integer integer = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .map(n -> n / 20)
                .distinct()
                .skip(1)
                .peek(System.out::println)
                .max((a, b) -> a - b)
                .get();
        System.out.println(integer);

        // get count
        Long l = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .map(n -> n / 20)
                .distinct()
                .count();
        System.out.println("Count is : " + l);

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        list1.parallelStream();
    }
}
