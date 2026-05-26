package ReviseSetDemo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetInterviewQuestion {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 1, 5, 3, 3, 2, 7};
        Set<Integer> treeSet = new TreeSet<>();
        for(int num : arr) {
            treeSet.add(num);
        }
        System.out.println(treeSet);
    }
}
