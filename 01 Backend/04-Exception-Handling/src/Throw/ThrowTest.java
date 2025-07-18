package Throw;

public class ThrowTest {
    public static void main(String[] args) {
        try {
            withdraw(1000, 2000);
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
            System.out.println(e);
        }
    }

    public static void withdraw(double bal, double amt) throws Exception {
        if(amt > bal) {
            // System.out.println("Insufficiet balance");
            throw new Exception("Insuffiecient balance");
        }
        System.out.println("Withdraw Successfull....");
    }
}
