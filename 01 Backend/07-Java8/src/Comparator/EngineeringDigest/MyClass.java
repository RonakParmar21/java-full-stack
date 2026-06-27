package Comparator.EngineeringDigest;

import java.util.Comparator;

public class MyClass implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {

        // for descending order
        return b - a;
    }
}
