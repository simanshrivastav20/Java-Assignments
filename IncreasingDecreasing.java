package Assignment2;

import java.util.Scanner;

public class IncreasingDecreasing {
    public static void main(String[] args) {
        Scanner inc = new Scanner(System.in);
        System.out.println("Input Fist number:");
        int firstnum = inc.nextInt();
        System.out.println("Input Second number:");
        int secondnum = inc.nextInt();
        System.out.println("Input Third number:");
        int thirdnum = inc.nextInt();
        if (firstnum>secondnum && firstnum>thirdnum){
            System.out.println("DECREASING ORDER");
        }
        else if (firstnum<secondnum && secondnum<thirdnum){
            System.out.println("INCREASING ORDER");
        }
        else{
            System.out.println("Neither increasing or decreasing order");
        }


    }
}
