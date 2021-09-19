package day25d;

import java.util.Arrays;

public class StringMethods3 {
    public static void main(String[] args) {
        String sentence="I love java";
        String []word=sentence.split(" ");
        System.out.println(Arrays.toString(word));

        for (int i = word.length-1; i >=0 ; i--) {
            System.out.print(word[i]+" ");
        }
        System.out.println();



        String str="ABCDE";
        char[]characters=str.toCharArray();

        System.out.println(Arrays.toString(characters));
    }
}
