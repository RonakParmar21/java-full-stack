package Predicates.EngineeringDigest;

import java.util.Scanner;
import java.util.function.Predicate;

public class TestPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        Predicate<Integer> isPrime = n -> {
            if (n <= 1) return false;
            if (n <= 3) return true;
            if (n % 2 == 0 || n % 3 == 0) return false;

            for (int i = 5; i * i <= n; i++) {
                if (n % i == 0 || n % (i + 2) == 0) return false;
            }
            return true;
        };

        if(isPrime.test(num)) System.out.println(num + " is a prime number.");
        else System.out.println(num + " is not a prime number.");
    }
}
