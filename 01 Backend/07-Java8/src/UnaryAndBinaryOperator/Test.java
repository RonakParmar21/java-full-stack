package UnaryAndBinaryOperator;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Test {
    public static void main(String[] args) {

        Function<Integer, Integer> function1 = x -> x * x;
        Function<String, String> function3 = str -> str.toLowerCase();

        // input ans output both are same type then use UnaryOperator
        UnaryOperator<Integer> unaryOperator = x -> x * x;
        System.out.println(unaryOperator.apply(5));

        UnaryOperator<String> unaryOperator1 = str -> str.toLowerCase();
        System.out.println(unaryOperator1.apply("rOnAk"));

        Function<String, Integer> function2 = str -> str.length();
    }
}
