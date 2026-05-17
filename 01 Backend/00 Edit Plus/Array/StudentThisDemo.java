public class StudentThisDemo {
    String name;
    int age;
    String course;

    StudentThisDemo() {
        this("Unknown", 0);
    }

    StudentThisDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        StudentThisDemo s1 = new StudentThisDemo();
        s1.showStudentDetails();

        StudentThisDemo s2 = new StudentThisDemo("Alice", 20);
        s2.hello(s2);
    }

    void showStudentDetails() {
        System.out.println("Name : " + name + ", age : " + age);
        hello(this);
    }

    void hello(StudentThisDemo s) {
        System.out.println("Hello " + s.name);
    }
}