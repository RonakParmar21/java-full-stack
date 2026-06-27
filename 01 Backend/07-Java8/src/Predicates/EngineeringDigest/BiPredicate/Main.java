package Predicates.EngineeringDigest.BiPredicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // predicate only use for 1 argument
        Predicate<Integer> predicate = x -> x % 2 == 0;

        // BiPredicate work with 2 arguments
        BiPredicate<Integer, Integer> biPredicate = (x, y) -> x % 2 == 0 && y % 2 == 0;
        System.out.println(biPredicate.test(10, 12));

        BiPredicate<String, Integer> biPredicate1 = (str, x) -> str.length() == x;
        System.out.println(biPredicate1.test("Ronak", 6));
    }
}
