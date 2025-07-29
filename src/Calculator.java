package src;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an infix expression (e.g., 3 + 4 * (2 - 1)):");
        String input = scanner.nextLine();

        try {
            String postfix = InfixToPostfixConverter.convert(input);
            double result = PostfixEvaluator.evaluate(postfix);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}

