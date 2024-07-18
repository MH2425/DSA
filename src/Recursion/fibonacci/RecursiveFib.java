package Recursion.fibonacci;

import java.util.Scanner;
public class RecursiveFib {
    public static int recursiveFib(int nMax) {
        if (nMax < 2) {
            return nMax;
        } else {
            return recursiveFib(nMax - 1) + recursiveFib(nMax - 2);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first N numbers in Fibonacci sequence: ");
        int nMax = scanner.nextInt();
        System.out.println("The first " + nMax + " numbers in Fibonacci sequence are: ");
        for (int i = 1; i <= nMax; i++) {
            System.out.println("f(" + i + ") = " + recursiveFib(i));
        }
    }
}
