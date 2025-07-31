package LockDemo;

public class Driver {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        Runnable t1 = () -> bankAccount.withdraw("wife", 200);
        Runnable t2 = () -> bankAccount.withdraw("papa", 500);

        new Thread(t1).start();
        new Thread(t2).start();
    }
}
