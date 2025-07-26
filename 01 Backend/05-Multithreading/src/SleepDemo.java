class SleepThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + "=====" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                System.out.println("Thread Interrupted" + interruptedException);
            }
        }
    }
}

public class SleepDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        SleepThread sleepThread = new SleepThread();
        sleepThread.setName("child");
        sleepThread.start();

        SleepThread sleepThread1 = new SleepThread();
        sleepThread1.setName("child1");
        sleepThread1.start();
    }
}
