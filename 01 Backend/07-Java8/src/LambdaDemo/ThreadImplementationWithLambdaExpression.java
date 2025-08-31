package LambdaDemo;

public class ThreadImplementationWithLambdaExpression {
    public static void main(String[] args) {
        Runnable task = () -> {
            for(int i=0;i<50;i++) {
                System.out.println("hello...");
            }
        };
        new Thread(task).start();
        for (int i=0;i<50;i++) {
            System.out.println("main...");
        }
    }
}
