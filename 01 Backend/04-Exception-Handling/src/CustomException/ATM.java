package CustomException;

public class ATM {
    public static void main(String[] args) {
        try {
            //withdraw(100, 1000);
            withdraw(10000, 10);
        } catch (InsuffiecientBalance e) {
            System.out.println(e.getMessage());
        }
    }

    public static void withdraw(double bal, double amt) throws InsuffiecientBalance {
        if(amt > bal)
            throw new InsuffiecientBalance("Insuffiecient balance : Available balance is = " + bal + " requested = " + amt);
        System.out.println("withdrawal amount is : " + amt + " successfull.");
    }
}
