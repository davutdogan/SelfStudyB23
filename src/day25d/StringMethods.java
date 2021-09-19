package day25d;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String sentence="I love you";
        String []word=sentence.split(" ");

        System.out.println(Arrays.toString(word));
        for (int i = word.length-1; i >=0 ; i--) {
            System.out.print(word[i]+" ");
        }
    }
}
