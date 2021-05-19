package Assignment;

import java.util.Scanner;
// program to print the value given by the user.

public class UserValue {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int x;
        System.out.println("Enter your name");
        String name=value.next();
        System.out.println("Enter your age");
        int age =value.nextInt();
        System.out.println("You entered a name:"+name);
        System.out.println("You entered age:"+age);

    }
}
