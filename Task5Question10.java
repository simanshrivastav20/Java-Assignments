package Assignment5;

public class Task5Question10 {// a Java program to find the two elements from a given array of positive and negative numbers such that their sum is closest to zero

    static void findMinSum(int[] arr, int n)
    {
        for(int i = 1; i < n; i++)
        {
            if (!(Math.abs(arr[i - 1]) <
                    Math.abs(arr[i])))
            {
                int temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
            }
        }
        int min = Integer.MAX_VALUE;
        int x = 0, y = 0;

        for(int i = 1; i < n; i++)
        {


            if (Math.abs(arr[i - 1] + arr[i]) <= min)
            {
                min = Math.abs(arr[i - 1] + arr[i]);
                x = i - 1;
                y = i;
            }
        }
        System.out.println("The two elements whose " +
                "sum is minimum are " +
                arr[x] + " and " + arr[y]);
    }


    public static void main(String[] args)
    {
        int[] arr = { 1, 60, -10, 70, -80, 85 };
        int n = arr.length;

        findMinSum(arr, n);
    }
}
