package StreamAPI.EngineeringDigest;

/*
- Collections convert into stream
- sequance of elements from collections so we can perform declarative and functional programming
- map, filter, reduce

Why?
- Readability :- streams provide a more readable and expressive way to perform operations on collections.
    - The syntax is concise and easy to understand, making it easier for other developers to read and maintain your code.

- Flexibility :- streams allow you to perform a variety of operations on collections, such as filtering, mapping, and reducing, without having to write multiple loops or methods.
    - This can save time and make your code more flexible.

- Parallelism :- streams can be processed in parallel, which can provide a significant performance boost for large collections.
    - With a for loop, you would have to write your own multi-threaded code to achieve parallelism.

- Encapsulation :- streams encourage encapsulation, as you can perform a series of operations on a collection without modifying the original data.
    - This can help prevent and improve code reliability.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // even number sum without using stream
        // this approach is called imperative approach
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) sum += arr[i];
        }

        // even number sum from array with using stream
        // this approach is called declarative approach
        int[] arr2 = {1, 2, 3, 4, 5};
        int sum2 = Arrays.stream(arr2)
                .filter(n -> n % 2 != 0)
                .sum();
        System.out.println(sum2);

        System.out.println("----------------------");
        List<String> list = Arrays.asList("apple", "banana", "mango");
        Stream<String> myStream = list.stream();

        String[] array = {"mango", "apple", "banana"};
        Stream<String> stream = Arrays.stream(array);

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);

        Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(100);

        Stream.generate(() -> "hello").limit(5);

        Stream<Integer> generateRandomNo = Stream.generate(() -> (int) (Math.random() * 100)).limit(100);
        generateRandomNo.forEach(System.out::println);

    }
}
