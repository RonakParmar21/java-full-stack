package Predicates.EngineeringDigest;

import java.util.Scanner;
import java.util.function.Predicate;

public class RangePrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a starting number : ");
        int sNum = sc.nextInt();

        System.out.print("Enter a ending number : ");
        int eNum = sc.nextInt();

        Predicate<Integer> isPrime = n -> {
            if (n <= 1) return false;
            if (n <= 3) return true;
            if (n % 2 == 0 || n % 3 == 0) return false;
            for (int i = 5; i * i <= n; i++) {
                if (n % i == 0 || n % (i + 1) == 0)return false;
            }
            return true;
        };

        for (int i = sNum; i <= eNum; i++) {
            if (isPrime.test(i)) System.out.println(i + " is a prime number.");
        }
    }
}
