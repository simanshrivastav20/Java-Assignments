package Assignment5;


import java.util.Arrays;

public class Task5Question6 {//a program to remove the duplicates from a sorted array change them into 0 and add 0 in the end.

//

    public static void main(String[] args) throws CloneNotSupportedException {
        // Array with duplicate elements

        Integer[] origArray = new Integer[] { 1, 2, 4, 9, 7, 3, 4, 5, 8, 6, 1, 7, 8 };

        Arrays.sort(origArray);
        int i=0;

        // This array has duplicate elements
        System.out.println(Arrays.toString(origArray));

        Integer[] tempArray = removeDuplicates(origArray);

        // Verify the array content
        System.out.println(Arrays.toString(tempArray));

        for(int j = 0, l = origArray.length; j < l;) {
            if(origArray[j] == 0)
                j++;
            else {
                int temp = origArray[i];
                origArray[i] = origArray[j];
                origArray[j] = temp;
                i ++;
                j ++;
            }
        }
        while (i < origArray.length)
            origArray[i++] = 0;
        System.out.print("\nAfter moving 0's to the end of the array: \n");
        for (int n : origArray)
            System.out.print(n+"  ");
        System.out.print("\n");
    }

    private static Integer[] removeDuplicates(Integer[] origArray) {

        for (int j = 0; j < origArray.length - 1; j++) {
            for (int i = j + 1; i < origArray.length - 1; i++) {
                if (origArray[j] == origArray[i]) {
                    origArray[i] = 0;
                }
            }
        }

        origArray[origArray.length - 1] = 0;

        return origArray;
    }


}
