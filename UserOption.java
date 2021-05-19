package Assignment;

import java.util.Scanner;

public class UserOption {
    public static void main(String[] args) {
//        System.out.println("Choose from the below Option:");
//        System.out.println("Enter 1 for Addition  ");
//        System.out.println("Enter 2 for Subtraction  ");
//        System.out.println("Enter 3 for Division  ");
//        System.out.println("Enter 4 for Multiplication  ");
//        System.out.println("Enter 5 for Average  ");




        Scanner Option = new Scanner(System.in);
        System.out.println("Enter number between 1 to 5");
        int i= Option.nextInt();
        if (i==1){
            System.out.println("Your Option is Addition");
        }
        if (i==2){
            System.out.println("Your Option is Subtraction");
        }
        if (i==3){
            System.out.println("Your Option is Division1");
        }
        if (i==4){
            System.out.println("Your Option is Multiplication");
        }
        if (i==5){
            System.out.println("Your Option is Average");}
        if(i>=6){
                System.out.println("Please enter number between 1 to 5");
            }
        }
    }

