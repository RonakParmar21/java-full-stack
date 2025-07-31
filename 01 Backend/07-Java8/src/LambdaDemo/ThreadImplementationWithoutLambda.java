package LambdaDemo;

class ThreadOne extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("child thread");
        }
    }
}

public class ThreadImplementationWithoutLambda {
    public static void main(String[] args) {
        ThreadOne threadOne = new ThreadOne();
        threadOne.start();

        for (int i = 0; i < 50; i++) {
            System.out.println("main thread");
        }
    }
}
