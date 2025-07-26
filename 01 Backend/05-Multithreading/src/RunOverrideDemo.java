class MyRunThread extends Thread {

}

public class RunOverrideDemo {
    public static void main(String[] args) {
        MyRunThread myRunThread = new MyRunThread();
        myRunThread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("main thread");
        }
    }
}
