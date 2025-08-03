package SortingDemo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(99);
        arrayList.add(1);
        arrayList.add(9);
        arrayList.add(2);
        arrayList.add(3);

        System.out.println(arrayList);

        Collections.sort(arrayList);

        ArrayList<Studentj> arrayList1 = new ArrayList<>();
        Studentj s1 = new Studentj(11, "raj");
        Studentj s2 = new Studentj(1, "vinay");
        Studentj s3 = new Studentj(88, "ronak");

        arrayList1.add(s1);
        arrayList1.add(s2);
        arrayList1.add(s3);

        System.out.println(arrayList1);

        Collections.sort(arrayList1);
        System.out.println(arrayList1);


        ArrayList<Employee> arrayList2 = new ArrayList<>();
        Employee e1 = new Employee(11, "Rohan", "IT");
        Employee e2 = new Employee(6, "Rohan", "IT");
        Employee e3 = new Employee(9, "Rohan", "IT");

        arrayList2.add(e1);
        arrayList2.add(e2);
        arrayList2.add(e3);

        System.out.println(arrayList2);
        Collections.sort(arrayList2, new Employee());
        System.out.println(arrayList2);
    }
}
