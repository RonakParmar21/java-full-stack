package ReviseSortingComparableComperator;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args) {
//        TreeSet<Student> treeSet = new TreeSet<>(new MyComparator());
        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(new Student(1, "Ronak", 78));
        treeSet.add(new Student(2, "Akshar", 13));
        treeSet.add(new Student(3, "Guru", 79));
        treeSet.add(new Student(4, "Man", 89));
        treeSet.add(new Student(5, "Divy", 24));
        treeSet.add(new Student(6, "Sarthak", 89));

        System.out.println(treeSet);

        Comparator<Student> byRoll = (s1, s2) -> s1.id - s2.id;
        Comparator<Student> studentComparator = Comparator.comparing(Student::getName).thenComparing(Student::getId);
        // this type of functionality I can not perform in comparable that's why comparator comes
    }
}
