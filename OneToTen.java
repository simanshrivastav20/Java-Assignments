package Assignment;

import java.util.Scanner;
//Ask the user to enter any 2 numbers in between 1-10 and add both of them to another variable call z.

public class OneToTen {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
//        int a;
//        int b;
//        int a[]={1,2,3,4,5,6,7,8,9,10};
//        int b[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Enter a number between 1 to 10 :");
        int a= number.nextInt();
        System.out.println("Enter next number between 1 to 10 :");
        int b= number.nextInt();
        if (a>10 && b>10){
            System.out.println("Your value is greater than 10");
        }
       int z= a+b;
        System.out.println("Adding two number we get z="+ z);


        //Using z for adding 30
        z=z+30;
        System.out.println("After adding 30 we get new z that is "  +z);


    }
}

