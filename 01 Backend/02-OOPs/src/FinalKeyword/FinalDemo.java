package FinalKeyword;

public final class FinalDemo {
    final int a = 10;
    // a = 20; // this is invalid
    // final int c; // this is also invalid
    final void m1() {
        System.out.println("Hello m1 method");
    }

    public static void main(String[] args) {
        FinalDemo finalDemo = new FinalDemo();
        finalDemo.m1();
    }
}

/* this is invalid because FinalDemo class is final */
//class Test extends FinalDemo {
//
//}
