package LockDemo;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int bal = 1000;
    private final ReentrantLock reentrantLock = new ReentrantLock();

    public void withdraw(String threadName, int amount) {
        System.out.println(threadName + " is trying to withdraw " + amount);

        if(reentrantLock.tryLock()) {// it will check lock is available or not.
            reentrantLock.lock();

            try {
                System.out.println(threadName + " acquire lock.");
                if(bal > amount) {
                    Thread.sleep(2000);
                    bal = bal - amount;
                    System.out.println("Withdraw " + amount + " remaining bal " + bal);
                } else {
                    System.out.println(threadName + " insufficient balance");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                reentrantLock.unlock();
            }
        } else {
            System.out.println(threadName + " let me to do some other task.");
        }
    }
}
