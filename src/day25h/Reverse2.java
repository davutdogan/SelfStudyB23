package day25h;

import java.util.Arrays;

public class Reverse2 {
    public static void main(String[] args) {
        String array[]={"Java","C#","Python"};

        String element=array[0];
        String reverse="";

        for (int i = element.length()-1; i >=0 ; i--) {
            reverse+=element.charAt(i);
        }
        array[0]=reverse;
        System.out.println(Arrays.toString(array));
    }

}
