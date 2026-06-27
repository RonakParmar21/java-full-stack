package Functions.EngineeringDigest;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
        Function<String, String> function1 = x -> x.toUpperCase();
        Function<String, String> function2 = x -> x.substring(0, 3);

//        Function<String, String> function3 = function1.andThen(function2);
//        System.out.println(function3.apply("Ronak"));

        System.out.println(function1.andThen(function2).apply("guru"));

//        new function
        Function<Integer, Integer> function4 = x -> 2 * x;
        Function<Integer, Integer> function5 = x -> x * x * x;
        System.out.println(function4.andThen(function5).apply(3));
        System.out.println(function5.andThen(function4).apply(3));
        System.out.println(function4.compose(function5).apply(3));
        System.out.println(function5.compose(function4).apply(3));


        Function<String, String> identityFunction = Function.identity();
        System.out.println(identityFunction.apply("Ronak"));
    }
}
