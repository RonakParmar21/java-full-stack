package Throws;

public class ThrowsTestingWithMethodChaining {
    public static void main(String[] args) throws ArithmeticException {
        System.out.println("main method");
        m1();
    }

    public static void m1() throws ArithmeticException {
        System.out.println("m1 method");
        m2();
    }

    public static void m2() throws ArithmeticException {
        System.out.println("m2 method");
        m3();
    }

    public static void m3() throws ArithmeticException {
        System.out.println("m3 method");
        System.out.println(10 / 0);
    }
}
