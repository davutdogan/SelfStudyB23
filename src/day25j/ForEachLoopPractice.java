package day25j;

import java.util.Arrays;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        int arr1[]={1,2,3,8,4},
                arr2[]={9,5,6};
        int arr3 []=new int[arr1.length+arr2.length];

        int j=0;
        for (int i = 0; i <arr1.length; i++) {
            arr3[j++]=arr1[i];
        }
        for (int i = 0; i <arr2.length ; i++) {
            arr3[j++]=arr2[i];
        }
Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
