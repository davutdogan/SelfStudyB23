package day25i;

import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        int num1[] = {1, 2, 3},
                num2[] = {4, 5};
        int num3[] = new int[num1.length + num2.length];

        int j = 0;
        for (int i = 0; i < num1.length; i++) {
            num3[j++] = num1[i];
        }


        for (int i = 0; i <num2.length ; i++) {
            num3[j++]=num2[i];
        }

        System.out.println(Arrays.toString(num3));
    }
}
