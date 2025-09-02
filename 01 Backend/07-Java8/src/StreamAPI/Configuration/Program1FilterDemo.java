package StreamAPI.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program1FilterDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println(arrayList);

        // write a program to take out list where number greater than 20.
        List<Integer> list = arrayList.stream().filter(i -> i > 20).collect(Collectors.toList());
        System.out.println(list);
    }
}
