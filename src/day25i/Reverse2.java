package day25i;

import java.util.Arrays;

public class Reverse2 {
    public static void main(String[] args) {
        String[] arr = {"Java", "C#", "Python", "Something"};
        for (int j = 0; j <=arr.length-1 ; j++) {
            String element = arr[j];
            String reverse = "";

            for (int i = element.length()-1; i >=0 ; i--) {
                reverse+=element.charAt(i);
            }
            arr[j]=reverse;
            System.out.println(Arrays.toString(arr));
        }
    }
}
