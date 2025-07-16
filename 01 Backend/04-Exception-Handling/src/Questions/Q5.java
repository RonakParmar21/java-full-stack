package Questions;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("hello" + m1());
    }

    public static int m1() {
        try {
            return 100;
        } catch (Exception e) {
            return 3;
        } finally {
            return 10;
        }
    }
}
