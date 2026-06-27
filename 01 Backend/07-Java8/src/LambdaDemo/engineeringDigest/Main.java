package LambdaDemo.engineeringDigest;

public class Main {
    public static void main(String[] args) {
        // without using lambda expression
        Employee employee = new SoftwareEngineer();
        System.out.println(employee.getName());

        // without using lambda expression
        // does not required SoftwareEngineer class
        Employee employee1 = () -> "Software";
        System.out.println(employee1.getName());

        Employee softwareEngineer = () -> "Software engineer";
        System.out.println(softwareEngineer.getName());

        Employee editor = () -> "Editor";
        System.out.println(editor.getName());
    }
}
