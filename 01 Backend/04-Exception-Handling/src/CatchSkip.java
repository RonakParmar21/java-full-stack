public class CatchSkip {
    public static void main(String[] args) {
        try {
            System.out.println("Try block");
        } catch (Exception e) {
            System.out.println("Catch block");
        } finally {
            System.out.println("Finally block");
        }
        System.out.println("done");
    }
}
