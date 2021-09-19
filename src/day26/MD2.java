package day26;

import java.util.Arrays;

public class MD2 {
    public static void main(String[] args) {
        int[][] array2D = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        System.out.println(Arrays.deepToString(array2D));
        System.out.println(Arrays.toString(array2D[2]));
        System.out.println(array2D[1][1]);

        System.out.println("------");

        for (int i = 0; i < array2D.length; i++) {
            int[] each1DArray = array2D[i];
            System.out.println(Arrays.toString(each1DArray));
            for (int j = 0; j < each1DArray.length; j++) {
                System.out.println(each1DArray[j]);
            }
        }


        System.out.println("=======================");

        for (int[] each : array2D) {
            for (int element:each             ) {
                System.out.print(element+" ");
            }
        }
    }
}
