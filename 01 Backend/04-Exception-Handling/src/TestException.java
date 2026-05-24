class A {
    A() {
        System.out.println("A");
    }
}

class B extends A {
    B() {
        System.out.println("B");
    }
}

public class TestException {
//    static int x = 10;
//    static {
//        x = x + 5;
//    }
    public static void main(String[] args) {
//        int a = 10 / 0;
//        StringBuilder sb1 = new StringBuilder("Java");
//        StringBuilder sb2 = new StringBuilder("Java");
//
//        System.out.println(sb1.equals(sb2));
//
//        System.out.println(x);

        B b = new B();
//        System.out.println(b);
    }
}
