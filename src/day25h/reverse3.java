package day25h;

import java.util.Arrays;

public class reverse3 {
    public static void main(String[] args) {
        String[] array = {"Java", "Python", "Something"};
        for (int j = 0; j <array.length ; j++) {
            String element = array[j];

            String reverse = "";

            for (int i = element.length() - 1; i >= 0; i--) {
                reverse += element.charAt(i);
            }
            array[j] = reverse;
        }
        System.out.println(Arrays.toString(array));
    }
}
