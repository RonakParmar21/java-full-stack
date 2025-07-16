package Throws;

public class ThrowThrows {
    public static void main(String[] args) {
        try {
            checkAgeCal(-1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkAgeCal(int age) throws Exception {
        if(age < 0) {
            throw new Exception("Age can not be negative");
        }
        if(age < 18) {
            throw new Exception("You are under age");
        }
    }
}
