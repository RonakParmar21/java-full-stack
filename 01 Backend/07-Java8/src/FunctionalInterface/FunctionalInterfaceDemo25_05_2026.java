package FunctionalInterface;

import java.util.Scanner;

@FunctionalInterface
public interface FunctionalInterfaceDemo25_05_2026 {
    public int sum(int a, int b);
    default int sub(int a, int b) { // default method must have a body default method can access using object
        return a - b;
    }
    static int mul(int a, int b) { // static method must have a body static method access using interface name
        return a * b;
    }
    static int div(int a, int b) {
        return a / b;
    }
//    final int div(int a, int b); // is not allow
}

class FunctionalInterfaceClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1 : ");
        int a = sc.nextInt();

        System.out.println("Enter a number 2 : ");
        int b = sc.nextInt();

        FunctionalInterfaceDemo25_05_2026 fi = (no1, no2) -> {
            System.out.println("Functional Interface ");
            return no1 + no2;
        };
        System.out.println("Sum of " + a + " and " + b + " is : " + fi.sum(a, b));

        System.out.println("Subtraction of " + a + " and " + b + " is : " + fi.sub(a, b));
        System.out.println("Multiplication of " + a + " and " + b + " is : " + FunctionalInterfaceDemo25_05_2026.mul(a, b));
    }
}


