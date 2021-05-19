package Assignment;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner integer = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = integer.nextInt();
        //If a number is divisible by both 3 and 5 it should print “Consultadd JAVA Training” as a string.
        if (i % 5 == 0 && i % 3 == 0) {
            System.out.println("Consultadd JAVA Training");
        }
        // to print a number is divisible by 3 it should print “Consultadd” as a string
        else if (i % 3 == 0) {
            System.out.println("Consultadd");
        }
        //If a number is divisible by 5 it should print “JAVA Training” as a string
        else if (i % 5 == 0) {
            System.out.println("JavaTraining");
        } else {
            System.out.println("Number is not divisible by 3 or 5");


        }
    }
}





