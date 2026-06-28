package Java8;

// Filter a list of integers to get only even numbers using Stream.filter()

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q2 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(13);
        integerList.add(43);
        integerList.add(12);
        integerList.add(90);
        integerList.add(23);
        integerList.add(56);

        List<Integer> list = integerList.stream().filter(x -> x % 2 == 0).toList();
        List<Integer> collect = integerList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(collect);
    }
}
