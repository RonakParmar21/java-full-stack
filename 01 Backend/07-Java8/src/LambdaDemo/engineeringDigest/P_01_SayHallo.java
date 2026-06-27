package LambdaDemo.engineeringDigest;

public class P_01_SayHallo {
    // without using lambda funtion
    private void sayHello() {
        System.out.println("Hello!");
    }

//    () -> {
//        System.out.println("Hello");
//        System.out.println("Nice to meet you!");
//    }

    public static void main(String[] args) {
        new P_01_SayHallo().sayHello();
    }
}
