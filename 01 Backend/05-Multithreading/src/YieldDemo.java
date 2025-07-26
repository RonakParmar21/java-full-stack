class YieldThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + "======" + i);
            Thread.yield();
        }
    }
}

public class YieldDemo {
    public static void main(String[] args) {
        YieldThread yieldThread = new YieldThread(); // 5
        YieldThread yieldThread1 = new YieldThread(); // 5

        yieldThread.start();
        yieldThread1.start();

    }
}
