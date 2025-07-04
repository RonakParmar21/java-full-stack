public class ATMEncapsulationAbstrationDemo {
    String name;
    private double balance;

    ATMEncapsulationAbstrationDemo(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public static void main(String[] args) {
        ATMEncapsulationAbstrationDemo atmEncapsulationAbstrationDemo = new ATMEncapsulationAbstrationDemo("Ronak", 100000);
        atmEncapsulationAbstrationDemo.showBalance();
    }

    void showBalance() {
        System.out.println("Your balance is : " + balance);
    }
}
