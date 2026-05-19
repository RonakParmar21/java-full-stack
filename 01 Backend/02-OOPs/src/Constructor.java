class Student {
    Student() {
        System.out.println("Default Constructor.");
    }

    Student(String name) {
        this();
        System.out.println("After calling default using this.");
        System.out.println("Parameterized Constructor : " + name);
    }
}

public class Constructor {
    public static void main(String[] args) {
//        Student s = new Student();
        Student s1 = new Student("Ronak");
    }
}
