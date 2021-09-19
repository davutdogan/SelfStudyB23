package day33;

import day25a.ArraysUtility;

import java.util.Arrays;

public class WarmUp {
    public static void main(String[] args) {
        char ch1[]={'a','b'};
        char ch2[]={'c','d'};



    }


    public static int[] removeElement(int[] array, int index) {
        if (index >= 0 &&index<=array.length-1){
            System.err.println("Invalid Index");

            System.exit(0);
        }
            int[] result = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            } else {
                result[j++] = array[i];
            }
        }
        return result;
    }
}
