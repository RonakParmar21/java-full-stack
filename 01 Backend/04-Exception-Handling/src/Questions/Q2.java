package Questions;

public class Q2 {
    public static void main(String[] args) {
        try {
            int x = 100 / 0;
            System.out.println("Hello div");
        } catch(ArithmeticException e) {
            System.out.println("Exception");
        }
        System.out.println("Done");
    }
}
