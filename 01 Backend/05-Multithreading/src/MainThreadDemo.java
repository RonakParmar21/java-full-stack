public class MainThreadDemo {
    public static void main(String[] args) {
        System.out.println("Main method is executed by : " + Thread.currentThread().getName());
    }
}
