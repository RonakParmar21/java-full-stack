package LambdaDemo;

import java.util.Scanner;

@FunctionalInterface
interface LambdaExpression25_05_2026 {
//    void add(int x, int y);
    int add(int x, int y);
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x : ");
        int no1 = sc.nextInt();
        System.out.println("Enter y : ");
        int no2 = sc.nextInt();
//        LambdaExpression25_05_2026 l = (x, y) -> System.out.println("Sum is " + (x + y));
//        l.add(no1, no2);

        LambdaExpression25_05_2026 l1 = (x, y) -> x + y;
        System.out.println("Sum is : " + l1.add(10, 20));
    }
}
