package StreamAPI.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program2MapDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println(arrayList);

        // write a program to takeout final list where we are adding 5 to each element.
        List<Integer> addFiveToEachElement = arrayList.stream().map(i -> i + 5).collect(Collectors.toList());
        System.out.println(addFiveToEachElement);
    }
}
