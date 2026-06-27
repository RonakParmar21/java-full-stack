package StaticMethod.engineeringDigest;

interface A {
    static void sayHello() {
        System.out.println("Interface A sayHello()");
    }

    default void sayByy() {
        System.out.println("Byy");
    }
}

public class MyClass implements A {
    // this is not override this is make new method implementation
    static void sayHello() {
        System.out.println("Hello there!");
    }

    public void sayByy() {

    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.sayHello();
//        MyClass.sayHello();
        A.sayHello();

        myClass.sayByy();
    }
}
