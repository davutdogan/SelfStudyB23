package day32;

import java.util.Arrays;

public class WU5 {
    public static String[] addString(String[] array, String str) {
        String []result = Arrays.copyOf(array, array.length + 1);
        result[result.length - 1] = str;
        return result;
    }
}
