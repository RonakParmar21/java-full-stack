package DefaultMethod.engineeringDigest;

interface Parent {
    default void sayHello() {
        System.out.println("Hello");
    }
}

class Child implements Parent {
    @Override
    public void sayHello() {
        System.out.println("Child say hello");
    }
}

public class MyClass {
    public static void main(String[] args) {
        Child child = new Child();
        child.sayHello();
    }
}
