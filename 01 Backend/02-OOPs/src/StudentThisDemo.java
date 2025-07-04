public class StudentThisDemo {
    String name;
    int age;
    String course;

    StudentThisDemo() {
        this("Unknown", 0);
        // this code will call parameterized constructor.
    }

    StudentThisDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        StudentThisDemo studentThisDemo = new StudentThisDemo();
        studentThisDemo.showStudentDetails();
        //studentThisDemo.hello(studentThisDemo);

        StudentThisDemo studentThisDemo1 = new StudentThisDemo("Ronak", 22);
        studentThisDemo1.showStudentDetails();
        studentThisDemo1.hello(studentThisDemo1);
    }

    void showStudentDetails() {
        System.out.println("Name : " + name + ", Age : " + age);
        hello(this); // this will represent here as default constructor
    }

    void hello(StudentThisDemo s) {
        System.out.println("Hello " + s.name);
    }
}
