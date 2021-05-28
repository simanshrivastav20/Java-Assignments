package Assignment4;

public class Task4Question5 {//Take ven and Odd out
    public static void main(String[] args) {
        int arr1 [] ={23,25,75,87,47,1,91,51,2};
        int arr2 []={22,44,64,76,98,12,43,54,90};
        int even=0;
        int odd=0;

        for (int i=0; i<arr1.length; i++){
            if ((arr1[i])%2==0)
            even=arr1[i];}

                System.out.println("Even number is :"+even);

        for (int i=0; i<arr1.length; i++){
            if ((arr2[i])%2!=0)
                odd=arr2[i];}

        System.out.println("Odd number is :"+odd);

    }

        }


