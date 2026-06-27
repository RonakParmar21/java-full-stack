package FunctionalInterface.engineeringDigest;

@FunctionalInterface
public interface Child extends Parent {
//    void sayByy(); // not allow because two abstract method
    void sayHello();

    default void sayByy() {

    }

    static void sayHii() {

    }
}
