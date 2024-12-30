package prime.number;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int n = in.nextInt();

        // Call the function to check primality
        if (isPrime(n)) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is NOT a Prime Number.");
        }
    }

    // Function to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // Numbers <= 1 are not prime
        }
        if (n == 2) {
            return true; // 2 is the smallest prime number
        }
        if (n % 2 == 0) {
            return false; // Even numbers > 2 are not prime
        }

        // Only check odd numbers from 3 to √n
        for (int i = 3; i <= Math.sqrt(n); i += 2) { // Increment by 2 to skip even numbers
            if (n % i == 0) {
                return false; // Found a divisor, so it's not prime
            }
        }

        return true; // No divisors found, so it's prime
    }
}
