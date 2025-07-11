package CommandLineArgument;

public class CommandLineArgumentDemo {
    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        System.out.println("First number is : " + number1);

        int number2 = Integer.parseInt(args[0]);
        System.out.println("Second number is : " + number2);

        int result = number1 + number2;
        System.out.println("Adition of number1 and number2 is : " + result);
    }
}
