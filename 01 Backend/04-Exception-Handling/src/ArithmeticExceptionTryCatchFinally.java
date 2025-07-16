public class ArithmeticExceptionTryCatchFinally {
    public static void main(String[] args) {
        System.out.println("Before Exception");

        try {
            int a = 10 / 0; // arithmeticexception-->runtime-->exception
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        } finally {
            System.out.println("Finally block");
        }
        System.out.println("After Exception");
    }
}
