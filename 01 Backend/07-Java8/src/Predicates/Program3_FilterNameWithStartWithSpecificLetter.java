package Predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Program3_FilterNameWithStartWithSpecificLetter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice",	"Bob",	"Charlie",	"David",	"Eva");
        Predicate<String> startsWithA	= name	->	name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);
    }
}
