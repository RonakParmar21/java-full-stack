package Questions;

public class Q4 {
    public static void main(String[] args) {
        try{
            try {
                int a = 10 / 0;
            } catch (NullPointerException e) {
                System.out.println("Inner catch");
            } catch (ArithmeticException e) {
                System.out.println("Arithment Exception Inner");
            }
        } catch (Exception e) {
            System.out.println("Outer Exception");
        }

        System.out.println("Done");
    }
}
