package Assignment4;

public class Task4Question2 {//a JAVA program that gives sum of all the values of array except the highest and lowest values.

    public static void main(String[] args) {
        int arr [] ={22,33,55,78,8,12,9,7};
        int sum = 0;
        int small= arr[0];
        int large = arr[0];
        int finalresult=0;


        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
            if (small>arr[i])
                small=arr[i];
        }
        System.out.println("Smallest number is "+ small);
        for (int i=0; i<arr.length; i++){
            if (large<arr[i])
                large=arr[i];
        }
        System.out.println("Largest number is "+ large);

        for (int i=0; i<arr.length; i++){
            sum+= arr[i];
            finalresult=sum-(large+small);

        }
        System.out.println("Sum of array except small and large is :"+finalresult);



        }

}
