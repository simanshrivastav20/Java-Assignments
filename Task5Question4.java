package Assignment5;

public class Task5Question4 {//add 2 matrices of same size

    public static void main(String[] args) {

        int[][] m1 = {{1, 5, 7}, {2, 4, 6}};
        int[][] m2 = {{1, 2, 1}, {4, 4, 3}};
        int[][] sum = new int[3][3];
//matrix addition
        System.out.println("The sum of given 2 matrices is : ");
        for (int a = 0; a <= m1.length; a++) {
            for (int b = 0; b <= m2.length; b++) {
                sum[a][b] = m1[a][b] + m2[a][b];
                System.out.print(sum[a][b] + " ");
            }

            System.out.println();
        }
    }
}