package Questions;

public class Q3 {
    public static void main(String[] args) {
//        try {
//            int arr[] = {10, 23, 33};
//            System.out.println(arr[1]);
//        } finally {
//            System.out.println("Hello");
//        }

        try {
            int[] arr = {10, 23, 33};
            System.out.println(arr[1]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("Finally block");
        }
    }
}
