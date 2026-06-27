package MethodReference.EngineeringDigest;

/*
- Method Reference allow us to refer to a method without invoking it,making our code cleaner and more readable.
- They can be used in place of lambda expression when the lambda expression only calls an existing method.
 */

import UnaryAndBinaryOperator.Test;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void print(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        List<String> students = Arrays.asList("Ronak", "Miki Maus", "Akshar", "Guru");
        // students.forEach(x -> System.out.println(x));

        // this is method reference
        students.forEach(Main::print);
    }

}
