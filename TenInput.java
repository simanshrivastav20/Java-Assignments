package Assignment2;

import java.util.Scanner;
//Take 10 values input from user using loop.
public class TenInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        int sum = 0;
       // int avg = 0;
        for (int i = 0; i < 10; i += 1){
            sum += input.nextInt();
//            avg += input.nextInt();
        }
        System.out.println("The total sum is: " + sum );//Print sum of all the numbers provided
        System.out.println("The total avg is:" + sum/10);//Print average of all the numbers provided
    }

}

