class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i+=2) {
            System.out.println("Even number is : " + i);
        }
    }
}

class OddThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 10; i+=2) {
            System.out.println("Odd number is : " + i);
        }
    }
}

public class EvenOddUsingThread {
    public static void main(String[] args) {
        new EvenThread().start();
        new OddThread().start();
    }
}
