package Assignment;

import java.util.Scanner;

public class ConditionalAction {
    public static void main(String[] args) {
        //int i;
        Scanner i = new Scanner(System.in);
        System.out.println("Enter any integer:");
        int integer= i.nextInt();
        if (integer%2 !=0)
        {
            System.out.println("NEW"); //If  is odd, print NEW
        }
        else if (integer%2==0 && integer>=2 && integer<=5){ //If  is even and in the inclusive range of 2 to 5 , print OLD
            System.out.println("OLD");
        }
        else if (integer%2==0 && integer>=6 && integer<=30) {//If  is even and in the inclusive range of 6 to 30, print NEW
            System.out.println("NEW");
        }
        else if (integer%2==0 && integer>=30) {//If  is even and greater than 30, print OLD
            System.out.println("OLD");
        }


        }
    }
