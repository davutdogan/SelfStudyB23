package day18;

import java.util.Arrays;

public class StringMethod4 {
    public static void main(String[] args) {
        String sentence="I love learning java programming language";

        String[] words=sentence.split(" ");



        for (int i = words.length-1; i >=0 ; i--) {

            System.out.print(words[i]+" ");
        }

        System.out.println();




    }
}
