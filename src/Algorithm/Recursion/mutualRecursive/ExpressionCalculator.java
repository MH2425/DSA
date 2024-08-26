package Algorithm.Recursion.mutualRecursive;

import java.util.Scanner;

/**
 * This program calculates the value of an expression
 * consisting of numbers, arithmetic operators, and parentheses.
 */
public class ExpressionCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String input = in.nextLine();
        String output = input.replace(" ","");
        Evaluator e = new Evaluator(output);
        int value = e.getExpressionValue();
        System.out.println(input + " = " + value);
    }
}
