public class TestEncapsulationAbstraction {
    public static void main(String[] args) {
        ATMEncapsulationAbstrationDemo atmEncapsulationAbstrationDemo = new ATMEncapsulationAbstrationDemo("yash", 2);
        atmEncapsulationAbstrationDemo.showBalance();
        //atmEncapsulationAbstrationDemo.balance = 0;
        atmEncapsulationAbstrationDemo.showBalance();

    }
}
