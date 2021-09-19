package day25c;

import java.util.Arrays;

public class Mate2 {
    public static void main(String[] args) {
        String[] arr = {"Sevgi", "Mehmet", "Jacob"};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].substring(0,3));

        }
    }
}
