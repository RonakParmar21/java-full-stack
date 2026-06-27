package Predicates.EngineeringDigest;

import java.util.function.Predicate;

public class PrimeNumberPredicate {
    public static void main(String[] args) {
        int number = 3;

        Predicate<Integer> isPrime = n -> {
            // if n is less then or equals to 1 then it never prime number.
            if (n <= 1) return false;

            // if n is less than or equals to 3 then remaining number is 2 and 3 so both are prime number
            if (n <= 3) return true;

            // if n is divisible by 2 or 3 successfully then it not be prime and remove most of number by this line
            if (n % 2 == 0 || n % 3 == 0) return false;

            // initialize : by 5 because I already check 1 to 4
            // condition : is equal to i <= Math.square(n)
            // increment : increasement skip numbers that divisible by 2 and 3
            for (int i = 5; i * i <= n; i += 6) {

                // n = 91
                // n % i == 0 || n % (i + 2) == 0
                // 91 % 5 == 0 || 91 % (5 + 2) == 0
                // return false - because 91 % 7 == 0 is divisible
                if (n % i == 0 || n % (i + 2) == 0) return false;
            }
            return true;
        };

        if (isPrime.test(number)) System.out.println(number + " is a prime number.");
        else System.out.println(number + " is not a prime number.");
    }
}
