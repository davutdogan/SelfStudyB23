package day25i;

import java.util.Arrays;

public class merge2 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3},
                arr2[] = {4, 5};

        int arr3[]=new int[arr1.length+arr2.length];
        int merge=0;

        for (int i = 0; i <arr1.length ; i++) {
            arr3[merge++]=arr1[i];
        }
        for (int i = 0; i <arr2.length ; i++) {
            arr3[merge++]=arr2[i];
        }

        System.out.println(Arrays.toString(arr3));
    }
}
