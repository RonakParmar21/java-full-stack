package Functions.EngineeringDigest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        // get length using function
        Function<String, Integer> function = x -> x.length();
        System.out.println(function.apply("Ronak"));

        // find 1st 3 character from string
        Function<String, String> function1 = x -> x.substring(0, 3);
        System.out.println(function1.apply("Ronak"));

        // get all students whoose name starts with ron
        Function<List<Student>, List<Student>> studentsWithRonPreFix = x -> {
            List<Student> result = new ArrayList<>();
            for(Student s : x) {
                if(function1.apply(s.getName()).equalsIgnoreCase("ron")) {
                    result.add(s);
                }
            }
            return result;
        };
        Student s1 = new Student(1, "ronak");
        Student s2 = new Student(2, "akshar");
        Student s3 = new Student(3, "ronesh");
        List<Student> students = Arrays.asList(s1, s2, s3);
        List<Student> filteredStudent = studentsWithRonPreFix.apply(students);
        System.out.println(filteredStudent);
    }

    private static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
