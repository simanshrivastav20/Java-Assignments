package Assignment5;

public class Task5Question3 {
    public static void main(String[] args) {//a Java program to find the second Smallest element in an array.
        int arr [] ={14,3,4,1,12,19,9};
        //Arrays.sort(arr);
        int small = arr[0];

        int secondSmall = arr[0];
        for (int i=0; i<= arr.length-1; i++){
            System.out.println(arr[i]);

            if (arr[i]<= small){
                secondSmall=small;
                small= arr[i];
            }
            else if (arr[i]< secondSmall){
                secondSmall=arr[i];
            }
        }
        System.out.println("Second Small is ------"+secondSmall);

    }
}
