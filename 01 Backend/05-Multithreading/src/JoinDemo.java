class JoinThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("child thread");
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        JoinThread joinThread = new JoinThread();
        joinThread.start();
        joinThread.join(); // main - jo line execute karega vahi wait karega.
        for (int i = 0; i < 5; i++) {
            System.out.println("main thread");
        }
    }
}
