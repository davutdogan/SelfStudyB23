package day30;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6},
                arr2 [] ={7,8,9};
        int arr3[]=new int [arr1.length+arr2.length];
int j=0;
        for (int i = 0; i <arr1.length ; i++) {
            arr3[j++]=arr1[i];
        }
        for (int i = 0; i <arr2.length ; i++) {
            arr3[j++]=arr2[i];
        }
        System.out.println(Arrays.toString(arr3));




    }
}
