package day25h;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        String array[] = {"Java", "Python", "C#"};
        for (int j = 0; j <array.length ; j++) {
            String element = array[j];
            String reverse="";

            for (int i = array.length-1; i >=0 ; i--) {
                reverse+=element.charAt(i);

            }
            array[0]=reverse;
        }
        
        System.out.println(Arrays.toString(array));


    }
}
