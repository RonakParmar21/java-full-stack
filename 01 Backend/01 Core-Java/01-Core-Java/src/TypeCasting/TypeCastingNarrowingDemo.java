package TypeCasting;

public class TypeCastingNarrowingDemo {
    public static void main(String[] args) {
        double num = 10.99;
        System.out.println("The double value : " + num);

        int data = (int) num;
        System.out.println("The int value : " + data);
    }
}
