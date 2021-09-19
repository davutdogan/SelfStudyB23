package day25c;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5};
        int reversed[] = new int[array.length];

        int j=0;

        for (int i = array.length-1; i >=0 ; i--) {
            reversed[j++]=array[i];
        }

        System.out.println(Arrays.toString(reversed));
    }
}
