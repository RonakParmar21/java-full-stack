package ReviseCollectionDemo;

import java.util.Iterator;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<Integer> nums = new java.util.ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        nums.add(10);
        System.out.println(nums);
        System.out.println(nums.get(3));
        System.out.println("Size of array list is : " + nums.size());

        if(nums.isEmpty())
            System.out.println("Array list is empty.");
        else
            System.out.println("Array list is not empty.");

        nums.add(3, 90);
        System.out.println(nums);

        Iterator<Integer> iterator = nums.iterator();
        while(iterator.hasNext()) {
            int data = iterator.next();
            if(data == 30) {
                System.out.println("Removing 30...");
                iterator.remove();
            } else {
                System.out.println(data);
            }
//            System.out.println(iterator.next());

        }
    }
}
