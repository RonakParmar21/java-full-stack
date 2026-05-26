package ReviseCollectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));

        ListIterator<String> listIterator = list.listIterator();
        System.out.println("Forward Direction");
        while(listIterator.hasNext()) {
            String data = listIterator.next();
            System.out.println(data);
            if(data.equals("Python")) {
                listIterator.set("React");
            }
        }
        System.out.println("Backward Direction");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        System.out.println(list);
    }
}
