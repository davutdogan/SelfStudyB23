package day32;

import java.util.Arrays;

public class WamUpTask2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int element = 10;
        array = addInteger(array, element);
        System.out.println(Arrays.toString(array));


        String[] group1 = {"Ali", "Veli", "Deli"};
        String student = "Hatice";
        group1 = addString(group1, student);
        System.out.println(Arrays.toString(group1));


    }

    public static int max(int[] array) {
        int max = array[0];
        for (int each : array) {
            max=Math.max(each,max);
        }
        return max;
    }

    public static String[] addString(String[] array, String str) {
        String[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length - 1] = str;
        return result;
    }

    public static double[] addDouble(double[] array, double number) {
        double[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length - 1] = number;
        return result;
    }


    public static int[] addInteger(int[] array, int number) {
       /* int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = number;
        return result;*/
        int[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length - 1] = number;
        return result;


    }
}
