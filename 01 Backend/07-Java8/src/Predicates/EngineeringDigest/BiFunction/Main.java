package Predicates.EngineeringDigest.BiFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> function = str -> str.length();
        System.out.println(function.apply("Ronak Parmar"));

        BiFunction<String, String, Integer> biFunction = (x, y) -> x.length() + y.length();
        System.out.println(biFunction.apply("Hii", " Hello"));


    }
}
