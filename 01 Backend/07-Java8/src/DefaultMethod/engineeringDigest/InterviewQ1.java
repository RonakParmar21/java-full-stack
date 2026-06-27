package DefaultMethod.engineeringDigest;

interface A {
    default void sayHello() {
        System.out.println("Hello Interface A");
    }
}

interface B {
    default void sayHello() {
        System.out.println("Hello Interface B");
    }
}

public class InterviewQ1 implements A, B {
    public static void main(String[] args) {
        InterviewQ1 interviewQ1 = new InterviewQ1();
        interviewQ1.sayHello();
    }

    @Override
    public void sayHello() {
        System.out.println("Own implementation");
//        A.super.sayHello();
//        B.super.sayHello();
    }
}
