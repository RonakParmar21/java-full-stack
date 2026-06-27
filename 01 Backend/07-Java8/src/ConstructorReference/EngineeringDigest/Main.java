package ConstructorReference.EngineeringDigest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ronak", "Miki Maus", "Akshar", "Guru");
//        List<Student> students = names.stream().map(x -> new Student(x)).collect(Collectors.toList());


        // this is constructor reference
        List<Student> students = names.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(students);
    }
}
