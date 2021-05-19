package Assignment;

import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        // a program in JAVA to break and continue if the following cases occurs
        Scanner Loop= new Scanner(System.in);
        System.out.println("Enter any number:");
        int number = Loop.nextInt();
//        int number = 0;
        while (number > 0) {
            System.out.println("Good Going");
            number++;
            continue;}
            if (number < 0) {
                System.out.println("Its Over");
                }

            }
        }



//        if (number<0){
//            System.out.println("Its Over");
//        }
//        if (number>0){
//            System.out.println("Good Going");
//        }


