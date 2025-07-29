package test;

import src.InfixToPostfixConverter;
import src.PostfixEvaluator;

public class CalculatorTest {
    public static void main(String[] args) {
        String expression = "3 + 4 * (2 - 1)";
        String postfix = InfixToPostfixConverter.convert(expression);
        double result = PostfixEvaluator.evaluate(postfix);

        System.out.println("Infix: " + expression);
        System.out.println("Postfix: " + postfix);
        System.out.println("Result: " + result);
    }
}

