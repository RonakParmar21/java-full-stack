class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyTask());
        thread.start();
    }
}
