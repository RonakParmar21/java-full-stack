package ReviseSortingComparableComperator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberTest {
    public static void main(String[] args) {
        List<NumberDemo> list = new ArrayList<>();

        list.add(new NumberDemo(5));
        list.add(new NumberDemo(10));
        list.add(new NumberDemo(2));

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
