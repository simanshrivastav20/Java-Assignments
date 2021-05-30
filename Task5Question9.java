package Assignment5;

public class Task5Question9 {//a Java program to find the sum of the two elements of a given array which is equal to a given integer.

    public static void main(String args[])
    {
        int[] arr = { 1, 2, 3, 4, 5, 6};
        int sum = 6;
        getPairsCount(arr, sum);
    }

    public static void getPairsCount(int[] arr, int sum)
    {

        int count = 0; // Initialize result

        // Consider all possible pairs and check their sums
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == sum)
                    count++;

        

        System.out.printf("Count of pairs is %d", count);

    }
}
