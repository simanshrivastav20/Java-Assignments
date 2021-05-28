package Assignment5;

import java.util.Arrays;

public class Task5Question2 {//a Java program to find the second largest element in an array.

    public static void main(String[] args) {
        int arr [] ={1,3,4,6,12,19,9};
        //Arrays.sort(arr);
        int large = arr[0];

        int secondLarge = arr[0];
        for (int i=0; i<= arr.length-1; i++){
            System.out.println(arr[i]);

            if (arr[i]>= large){
                secondLarge=large;
                large = arr[i];
            }
            else if (arr[i]> secondLarge){
                secondLarge=arr[i];
            }
        }
       System.out.println("Second large is ------"+secondLarge);






}}
