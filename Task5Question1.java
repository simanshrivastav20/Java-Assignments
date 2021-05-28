package Assignment5;

public class Task5Question1 {// a Java program to remove duplicate elements from an array.

    public static void main(String[] args) {
        String[] strarr = {"Java", "AWS", "Python", "Java", "AWS", "BA"};
        String[] duplicate= {};
        for (int p = 0; p < strarr.length - 1; p++) { //0 1  2 3 4 5
            for (int j = p + 1; j < strarr.length; j++) {//1 2 3 4 5
                if ((strarr[p]).equals(strarr[j]) && (p != j)) {
                   System.out.println("Duplicates are " + strarr[j]);



                }

            }

        }}}






