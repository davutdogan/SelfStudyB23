package day25j;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        String letters1[]={"A","B","D","C"},
                letters2[]={"E","G","F"};

        String letters3[]=new String[letters1.length+letters2.length];
        int j=0;

        for (String each:letters1) {
            letters3[j++]=each;
        }
        for (String each:letters2   ) {
            letters3[j++]=each;
        }
        Arrays.sort(letters3);
        System.out.println(Arrays.toString(letters3));

    }
}
