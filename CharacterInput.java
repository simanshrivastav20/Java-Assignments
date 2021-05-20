package Assignment;

import java.util.Scanner;
//JAVA program which takes character input from the user
public class CharacterInput {
    public static void main(String[] args) {
        char alphabet;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any alphabet:");
        alphabet = input.next().charAt(0);
        System.out.println("Alphabet is :"+ alphabet);
        if (alphabet=='r' || alphabet== 'a' ||alphabet=='n' || alphabet== 'd' ||alphabet=='o' || alphabet== 'm' ||
        alphabet=='R' || alphabet== 'A' ||alphabet=='N' || alphabet== 'D' ||alphabet=='O' || alphabet== 'M'){
            System.out.println("FOUND");
        }
        else {
            System.out.println("NOT FOUND");
        }



    }
}
