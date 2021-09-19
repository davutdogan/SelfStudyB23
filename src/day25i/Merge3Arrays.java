package day25i;

import java.util.Arrays;

public class Merge3Arrays {
    public static void main(String[] args) {
        int arr1[] = {2, 1, 3, 4},
                arr2[] = {6, 5, 7, 8},
                arr3[] = {10, 9, 11, 12};

        int arr4[] = new int[arr1.length + arr2.length + arr3.length];
        int j = 0;

        for (int i = 0; i <arr1.length ; i++) {
            arr4[j++]=arr1[i];
        }
        for (int i = 0; i <arr2.length ; i++) {
            arr4[j++]=arr2[i];
        }
        for (int i = 0; i <arr3.length ; i++) {
            arr4[j++]=arr3[i];
        }


        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr4));

    }
}
