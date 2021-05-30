package Assignment5;

public class Task5Question7 {// a Java program to get the difference between the largest and smallest values in an array of integers

    public static void main(String[] args) {
        int[] array_nums = {33,49,20,19,28,79,5,99,15};
        System.out.print("\nOriginal array: \n");
        for (int n : array_nums)
            System.out.print(n+"  ");
        int large = array_nums[0];
        int small =array_nums[0];

        for (int i=0; i<array_nums.length-1; i++) {
            if (large<array_nums[i]) {
                large = array_nums[i];

            }
            else if (small>array_nums[i]){
                small=array_nums[i];
            }


        }
        System.out.println("\n Largest number is:"+large);
        System.out.println("\n Smallest number is:"+small);
        System.out.println("Largest - Smallest is :"+(large-small));

    }
}
