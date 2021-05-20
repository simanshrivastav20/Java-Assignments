package Assignment;

import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        // a program in JAVA to break and continue if the following cases occurs

        while (true) {
            Scanner Loop= new Scanner(System.in);
            System.out.println("Enter any number:");
            int number = Loop.nextInt();
            if(number>0) {
                System.out.println("Good Going");
            }else{
                System.out.println("Its Over");
                break;
            }
          }

            }
        }



