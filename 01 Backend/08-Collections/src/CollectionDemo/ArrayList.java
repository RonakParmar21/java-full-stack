package CollectionDemo;

import java.sql.Array;
import java.util.Iterator;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        // order is preserve
        // duplication allow
        // index wise access

        List<Integer> nums = new java.util.ArrayList<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(10);
        nums.add(20);

        System.out.println(nums);

        // random access based on index
        System.out.println(nums.get(3));

        // size of list
        System.out.println(nums.size());

        // list is empty or not
        if(nums.isEmpty())
            System.out.println("not empty");
        else
            System.out.println("empty");

        // add element in specific location
        nums.add(3, 90);
        System.out.println(nums);

        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            int data = iterator.next();
            if(data == 30) {
                System.out.println("Removing 30");
                iterator.remove();
            } else
                System.out.println("Data is : " + data);
        }
    }
}
