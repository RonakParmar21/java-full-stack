package MethodReference;

@FunctionalInterface
interface Test {
    void abc();
}

class Demo {
    static void fun() {
        System.out.println("Fun...");
    }
}

public class Main {
    public static void main(String[] args) {
        Test obj = Demo::fun;
        obj.abc();
    }
}
