package Assignment2;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        int p, b, h;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        h = in.nextInt();

        for (p = 1; p <= h; p++) {
            for (b = 1; b <= p; b++)
                System.out.print(b);
            System.out.println("");

        }
    }
}
