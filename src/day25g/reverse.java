package day25g;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        String[] arr = {"Java", "Python", "C#"};
        for (int j = 0; j <arr.length ; j++) {
            String element=arr[j];
            String reverse="";

            for (int i = element.length()-1; i >=0 ; i--) {
                reverse+=element.charAt(i);
            }
            arr[j]=reverse;
        }
        System.out.println(Arrays.toString(arr));

    }
}
