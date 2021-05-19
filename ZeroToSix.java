package Assignment;
//a program that prints all the numbers from 0 to 6 except 3 and 6.

public class ZeroToSix {
    public static void main(String[] args) {
        int i = 0;
        while (i < 7) {
            if (i == 3) {
                i++;
                continue;
            }
            if (i == 6) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }}
