public class ChildParentExceptionDemo {
    public static void main(String[] args) {
        String s = null;
        try {
            int length = s.length();
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println("Parent : " + e);
        }
    }
}
