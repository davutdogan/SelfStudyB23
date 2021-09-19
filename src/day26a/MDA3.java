package day26a;

import java.util.Arrays;

public class MDA3 {
    public static void main(String[] args) {
        int[][][] arr3D = {{{1, 2, 3}, {4, 5}}, {{6, 7, 8}, {9, 10}}};
        System.out.println(Arrays.deepToString(arr3D));
        System.out.println(Arrays.deepToString(arr3D[1]));
        System.out.println(Arrays.toString(arr3D[0][0]));
        System.out.println(arr3D[0][0][1]);

        for (int[][] each2D : arr3D) {
            for (int[] each1D : each2D) {
                for (int element : each1D) {
                    System.out.println(element+" ");
                }
            }
        }
    }
}
