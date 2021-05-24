package Assignment2;

import java.util.Scanner;

public class LongTypeInput { //JAVA program that takes long type input from user
    public static void main(String[] args) {
        long n, sum;
        int count = 0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number ");
        n=scan.nextLong();

        for(sum=0 ;n!=0 ;n/=10)
        {

            sum+=n%10;
            count++;
        }
        System.out.println("Number of digits entered is "+count); //Calculate and display the number of digits.
        System.out.println("Sum of digits of a number is "+sum); //Calculate the sum of all the digits of the input.

    }

    }

