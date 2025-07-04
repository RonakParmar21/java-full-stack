import java.util.Scanner;

public class Course {
    String name;
    int duration;

    Course() {
        System.out.println("Constructor called...");
    }

    Course(String name) {
        System.out.println(name);
        System.out.println("Parameterized constructor called...");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Before object create...");
        Course c1 = new Course();
        c1.name = "Java Full Stack";
        System.out.println("After object create...");
        c1.learn(c1);

        Course c2 = new Course();
        c2.name = "Devops";
        c2.learn(c2);

        // PARAMETERIZED CONSTRUCTOR.
        Course c3 = new Course("DSA");
    }

//    void learn() {
//        System.out.println("We are learning " + name);
//    }

    void learn(Course c) {
        System.out.println("We are learning " + c.name);
    }
}
