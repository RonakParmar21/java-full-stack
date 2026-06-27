package Predicates.EngineeringDigest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> salaryGreaterThanOneLac = x -> x > 100000;
        System.out.println(salaryGreaterThanOneLac.test(100001));


        // with using predicates
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(n -> n).sum();
        System.out.println(sum);

        // without using predicates
        int sum2 = 0;
        for(int number : numbers) {
            if(number % 2 == 0) {
                sum2 += number;
            }
        }
        System.out.println(sum2);

        Predicate<Integer> isEven = x -> x % 2 == 0;
        List<Integer> n = Arrays.asList(1, 2, 3, 4, 5);
        for (Integer i : n) {
            if(isEven.test(i)) System.out.println(i);
        }

        Predicate<String> stringPredicate = x -> x.toLowerCase().charAt(0) == 'r';
        System.out.println(stringPredicate.test("Ronak"));

        Predicate<String> endWithLetterK = x -> x.toLowerCase().charAt(x.length()-1) == 'k';
//        Predicate<String> and = stringPredicate.and(endWithLetterK);
//        Predicate<String> and = stringPredicate.or(endWithLetterK);
//        System.out.println(and.test("Ronak"));


        Predicate<String> predicate = Predicate.isEqual("Ronak");
        System.out.println("isEqual() : " + predicate.test("Ronak"));
    }
}
