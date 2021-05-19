package Assignment;

import java.util.Scanner;

public class FloatingPointNumber {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter any number:");
        int number=i.nextInt();
        if (number==0){
            System.out.println("Zero");
        }
        else if (number>=1){
            System.out.println("positive");
        }
        else if (number<0){
            System.out.println("negetive");
        }
    }
}
