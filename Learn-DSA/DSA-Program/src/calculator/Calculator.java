package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int num1 = in.nextInt();

        System.out.println("Enter the Operator: " );
        char operator = in.next().charAt(0);

        System.out.println("Enter the Second Number: ");
        int num2 = in.nextInt();

        double result = 0;

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("cannot divided by 0");
                    return;
                }
            }
            default -> {
                System.out.println("invalid input, please enter valid operator!!!");
                return;
            }
        }
        System.out.println("The Result = "+result);

    }
}
