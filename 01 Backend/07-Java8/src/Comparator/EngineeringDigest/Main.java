package Comparator.EngineeringDigest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(43);
        list.add(1);
        list.add(53);
        list.add(90);
        list.add(0);

        // it will sort ascending order but I want descending order then use cmparator
//        Collections.sort(list);
//        System.out.println(list);

        Collections.sort(list, new MyClass());
        System.out.println(list);

        // with use of lambda expression
        Collections.sort(list, (a, b) -> b - a);
        System.out.println(list);

        Collections.sort(list, (a, b) -> (a % 2 == 0) ? a - b : b - a);
        System.out.println("with module" + list);
    }
}
