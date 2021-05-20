package Assignment;

import java.util.Scanner;
// a Java program that reads a floating-point number and prints "zero" if the number is zero..

public class FloatingPointNumber {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter any number:");
        int number=i.nextInt();
        if (number==0){
            System.out.println("Zero");
        }
        // Add  "large" if it exceeds 1,000,000.
        else if (number>=1){
            if (number>100000){
                System.out.println("positive large");
            }
            // Otherwise, print "positive" or "negative"
            else   System.out.println("positive");

        }
        else if (number<0){
            System.out.println("negetive");
        }
    }
}
