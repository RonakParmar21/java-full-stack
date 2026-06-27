package Predicates.EngineeringDigest.BiSupplier;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> 1;
        System.out.println(supplier.get());

        // BiSupplier is not available because function can only return only 1 value
    }
}
