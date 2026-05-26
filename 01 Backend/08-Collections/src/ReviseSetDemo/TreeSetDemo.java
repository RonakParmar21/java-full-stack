package ReviseSetDemo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(40);
        set.add(20);
        set.add(100);
        set.add(150);
        System.out.println(set);
    }
}
