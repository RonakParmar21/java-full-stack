package Predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Program2_FilterStringWithLength {
    public	static	void	main(String[]	args) {
        List<String> words = Arrays.asList("apple",	"banana",	"orange",	"grape",	"kiwi");
        Predicate<String> hasSpecificLength	= word	->	word.length()	==	5;
        words.stream().filter(hasSpecificLength).forEach(System.out::println);
    }
}
