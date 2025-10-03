package Predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate_Chaining {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,	2,	3,	4,	5,	6,	7,	8,	9,	10);
        Predicate<Integer> isEven = num -> num %	2 ==0;
        Predicate<Integer> isGreaterThan5 =	num -> num >	5;
        numbers.stream().filter(isEven.and(isGreaterThan5)).forEach(System.out::println);
    }
}
