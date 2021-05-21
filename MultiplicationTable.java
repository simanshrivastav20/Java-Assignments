package Assignment2;
// to print multiplication table of a certain number taken from user,
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter any number:");
        int table= number.nextInt();
        for (int x= 1; x<=10; x++){
            System.out.println(table+"*"+x+"="+table*x);
        }
    }
}
