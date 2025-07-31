package FunctionalInterface;

public interface BeforeJava1Point8Demo {
    int add(int a, int b);
}

class Child implements BeforeJava1Point8Demo {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

class BeforeJava1Point8 {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.add(5, 5));
    }
}