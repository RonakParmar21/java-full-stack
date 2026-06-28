package Java8;

// Use a lambda to sort a list of strings alphabetically.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Q1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("Ronak");
        stringList.add("Miki Maus");
        stringList.add("Akshar");
        stringList.add("Man");
        stringList.add("Guru");

        stringList.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println(stringList);
    }
}
