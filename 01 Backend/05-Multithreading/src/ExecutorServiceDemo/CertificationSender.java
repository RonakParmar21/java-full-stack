package ExecutorServiceDemo;

public class CertificationSender implements Runnable {
    private final String stdName;

    public CertificationSender(String stdName) {
        this.stdName = stdName;
    }

    @Override
    public void run() {
        System.out.println("Sending certification to " + stdName + " by thread " + Thread.currentThread().getName());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Certificate send to " + stdName + " by thread " + Thread.currentThread().getName());
    }
}
