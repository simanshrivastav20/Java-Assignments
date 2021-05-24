package Assignment2;

import java.util.Scanner;

public class FloatingPointNumber {
    public static void main(String[] args) {
        Scanner floating = new Scanner(System.in);
        System.out.println("Enter first number:");
        float num1 = floating.nextFloat();
        System.out.println("Enter second number:");
        float num2 = floating.nextFloat();
        if ((num1 - num2) <= 0.01) {
            System.out.println("These numbers are the same.");
        }
        else {
            System.out.println("These numbers are different.");
        }
    }
}
