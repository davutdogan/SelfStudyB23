package day26;

import java.util.Arrays;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        int [][]arr2D={{1,2,3},{4,5},{6,7,8}};
        System.out.println(arr2D.length);
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(arr2D[1][1]);
        System.out.println(arr2D[2][1]);
        System.out.println("-----------------");

        for (int i = 0; i <arr2D.length ; i++) {
            int [] eac1DArray=arr2D[i];
            System.out.println(Arrays.toString(eac1DArray));
        }

    }
}
