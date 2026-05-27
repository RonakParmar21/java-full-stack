package ReviseSortingDemo;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(99);
        al.add(1);
        al.add(9);
        al.add(2);
        al.add(3);
        System.out.println(al);

        Collections.sort(al);
        System.out.println(al);

        ArrayList<Student> arrayList = new ArrayList<>();
        Student s1 = new Student(11, "Ronak");
        Student s2 = new Student(1, "Akshar");
        Student s3 = new Student(88, "Guru");

        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);

        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println(arrayList);


        ArrayList<Employee> arrayList1 = new ArrayList<>();
        Employee e1 = new Employee(11, "Ronak", "IT");
        Employee e2 = new Employee(6, "Akshar", "HR");
        Employee e3 = new Employee(9, "Guru", "Management");
        arrayList1.add(e1);
        arrayList1.add(e2);
        arrayList1.add(e3);

        System.out.println(arrayList1);
        Collections.sort(arrayList1, new Employee());
        System.out.println(arrayList1);

    }
}
