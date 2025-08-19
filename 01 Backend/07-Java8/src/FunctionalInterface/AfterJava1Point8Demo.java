package FunctionalInterface;

@FunctionalInterface
public interface AfterJava1Point8Demo {
    int add(int a, int b);
    //int sub(int a, int b);
}

class AfterJava1Point8 {
    public static void main(String[] args) {
        AfterJava1Point8Demo aj1p8 = (a, b) -> a + b;
        AfterJava1Point8Demo afterJava1Point8Demo = (a, b) -> {
            System.out.print("Lambda Expression : ");
            return a + b;
        };
        System.out.println(aj1p8.add(5, 10));

        System.out.println(afterJava1Point8Demo.add(10, 30));
    }
}