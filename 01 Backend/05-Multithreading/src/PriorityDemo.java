class MyThreadTwo extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
    }
}

public class PriorityDemo {
    public static void main(String[] args) {
        MyThreadTwo myThreadTwo = new MyThreadTwo();
        myThreadTwo.setName("Thread myThreadTwo");
        myThreadTwo.setPriority(Thread.MIN_PRIORITY);

        MyThreadTwo myThreadTwo1 = new MyThreadTwo();
        myThreadTwo1.setName("Thread myThreadTwo1");
        myThreadTwo1.setPriority(Thread.MAX_PRIORITY);

        myThreadTwo.start();
        myThreadTwo1.start();
    }
}
