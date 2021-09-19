package day26;

import java.util.Arrays;

public class MoveAllZeros {
    public static void main(String[] args) {
        int[] array = {10, 0, 5, 0, 1, 0};
        int[] result = new int[array.length];

        int i = 0;
        for (int each : array) {
            if (each != 0) {
                result[i++] = each;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
