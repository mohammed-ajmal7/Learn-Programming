package armstrong.number;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt(); // Read input number

        // Check if the number is an Armstrong number
        if (findArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    // Method to check if a number is an Armstrong number
    static boolean findArmstrong(int num) {
        int original = num;
        int sum = 0;

        // Calculate the sum of cubes of the digits
        while (num > 0) {
            int digit = num % 10;       // Get the last digit
            sum += digit * digit * digit; // Add the cube of the digit
            num /= 10;                 // Remove the last digit
        }

        return sum == original; // Compare with the original number
    }
}
