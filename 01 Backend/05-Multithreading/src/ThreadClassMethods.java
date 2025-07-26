class MyThreadOne extends Thread {
    @Override
    public void run() {
        System.out.println("MyThreadOne class thread name is : " + Thread.currentThread().getName());
    }
}

public class ThreadClassMethods {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread thread = Thread.currentThread();
        thread.setName("My New Main Thread");
        System.out.println(thread);
        System.out.println(Thread.currentThread().getName());


        MyThreadOne myThreadOne = new MyThreadOne();
        myThreadOne.setName("Child Thread");
        myThreadOne.start();
    }
}
